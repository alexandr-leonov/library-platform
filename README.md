Digital marketplace


## Install infrastructure

```
# Set up 1 node k8s

> minikube start --memory=6144

# Go to environment folder

> cd k8s

# install evnironment settings

> kubectl apply -f cluster-namespace.yaml

# install components

> kubectl apply -f kafka/zookeeper-cluster.yaml
> kubectl apply -f kafka/kafka-broker.yaml

For debug use:
> kubectl port-forward kafka-0 9092:9092 -n library-platform

```