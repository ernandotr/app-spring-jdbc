package com.ernando.rezende.cluster.service;

import java.util.List;

import com.ernando.rezende.cluster.model.Cluster;

public interface ClusterService {

	List<Cluster> createClusters(List<Cluster> newClusters);

    List<Cluster> deleteClusters(List<Integer> ids);

    List<Cluster> retrieveClusters();

    Cluster updateCluster(Cluster updateCluster);

    Cluster retrieveClusterById(int id);
}
