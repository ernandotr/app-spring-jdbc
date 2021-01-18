package com.ernando.rezende.cluster.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ernando.rezende.cluster.model.Cluster;
import com.ernando.rezende.cluster.model.ClusterMapper;
@Repository
public class ClusterDaoImpl implements ClusterDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ClusterDaoImpl.class);

    public List<Cluster> createClusters(List<Cluster> newClusters){
        for(int i = 0; i < newClusters.size(); i++) {
            int id = newClusters.get(i).getId();
            String name = newClusters.get(i).getName();
            String query = "INSERT INTO cluster(id, name) VALUES (?,?)";
            jdbcTemplate.update(query, id, name);
        }
        return newClusters;
    }

    public List<Cluster> deleteClusters(List<Integer> ids){
        List<Cluster> oldClusters = new ArrayList<Cluster>();
        for(int i = 0; i < ids.size(); i++) {
            logger.info("id: {}", retrieveClusterById(ids.get(i)));
            oldClusters.add(retrieveClusterById(ids.get(i)));
            String query = "delete from clustertest where id = ?";
            jdbcTemplate.update(query, ids.get(i));
        }
        return oldClusters;
    }

    public List<Cluster> retrieveClusters(){
        return jdbcTemplate.query("select * from cluster", new ClusterMapper());
    }

    @Override
    public Cluster retrieveClusterById(int id) {
        return jdbcTemplate.query("select * from cluster where id = " + id, new ClusterMapper()).get(0);
    }

    @Override
    public Cluster updateCluster(Cluster updateCluster) {
        jdbcTemplate.update("update cluster set name = ? where id = ?", updateCluster.getName(), updateCluster.getId());
        return updateCluster;
    }
}
