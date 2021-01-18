package com.ernando.rezende.cluster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernando.rezende.cluster.dao.ClusterDao;
import com.ernando.rezende.cluster.model.Cluster;

@Service
public class ClusterServiceImpl implements ClusterService{
//    private static final Logger logger = LoggerFactory.getLogger(ClusterServiceImpl.class);

    @Autowired
    private ClusterDao clustersDao;
    @Override
    public List<Cluster> createClusters(List<Cluster> newClusters) {
        // dao to call create clusters
        return clustersDao.createClusters(newClusters);
    }

    @Override
    public List<Cluster> deleteClusters(List<Integer> ids) {
        return clustersDao.deleteClusters(ids);
    }

    @Override
    public List<Cluster> retrieveClusters() {
        return clustersDao.retrieveClusters();
    }

    @Override
    public Cluster updateCluster(Cluster updateCluster) {
        return clustersDao.updateCluster(updateCluster);
    }

    @Override
    public Cluster retrieveClusterById(int id) {
        return clustersDao.retrieveClusterById(id);
    }
}