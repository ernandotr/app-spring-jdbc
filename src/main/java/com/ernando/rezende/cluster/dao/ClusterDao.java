package com.ernando.rezende.cluster.dao;

import java.util.List;

import com.ernando.rezende.cluster.model.Cluster;

public interface ClusterDao {

	public List<Cluster> createClusters(List<Cluster> newClusters);

    public List<Cluster> deleteClusters(List<Integer> ids);

    public List<Cluster> retrieveClusters();

    Cluster retrieveClusterById(int id);

    Cluster updateCluster(Cluster updateCluster);
}
