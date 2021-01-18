package com.ernando.rezende.cluster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ernando.rezende.cluster.model.Cluster;
import com.ernando.rezende.cluster.service.ClusterService;

@RestController
@RequestMapping("/v1/clusters")
public class ClusterController {
    @Autowired
    private ClusterService clusterService;

    @PostMapping
    public ResponseEntity<List<Cluster>> createClusters(@RequestBody List<Cluster> clusters){
        return new ResponseEntity<>(clusterService.createClusters(clusters), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Cluster> retrieveClusters(){
        return clusterService.retrieveClusters();
    }

    @DeleteMapping
    public List<Cluster> deleteClusters(@RequestBody List<Integer> ids) {
        return clusterService.deleteClusters(ids);
    }

    @PutMapping
    public ResponseEntity<Cluster> updateCluster(@RequestBody Cluster updateCluster){
        return new ResponseEntity<>(clusterService.updateCluster(updateCluster), HttpStatus.CREATED);
    }

}
