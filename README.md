socrata-thirdparty-utils
========================

Wrappers and helpers for third-party libraries

opencsv
-------

`CSVIterator`, which produces an `Iterator` from a `CSVReader`.

typesafe-config
---------------

`Propertizer`, which converts a (part of) a `Config` hierarchy into a set of
`Properties` for use with systems that want to be configured that way.

async-http-client
-----------------

`FAsyncHandler`, which gathers the status and headers before creating a consumer
for the response body.

curator
-------

* `CuratorConfig`, a common config class for Curator services
* `CuratorInitializer`, common initialization stuff for Curator service discovery
* `CuratorServiceBase`, a Trait for curator-based service clients
* `ProviderCache`, a cache for Curator service providers
* `CuratorBroker`, a class for registering a service with Curator
* `CuratorServiceIntegration`, a helper trait to spin up ZK, Curator, discovery for testing

geojson
-------

GeoJSON Codecs for [rojoma-json](http://github.com/rjmac/rojoma-json).  Has no dependencies on GeoTools and integrates well into serializing geoJSON as part of larger document or into streaming serializers.

metrics
-------

Support for Coda Hale / Dropwizard Metrics

* `Metrics` trait to mix in for Scala-friendly metrics APIs
* `MetricsOptions` and `MetricsReporter` for easy initialization of the metrics library and various reporters from config
* Support for instrumentation of socrata-http services via `SocrataHttpSupport.getHandler`

Releasing
=========

Run `sbt-release` and set an appropriate version.

Perf Benchmarking
=================

The perf project uses JMH for precise performance profiling as well as stack-based profiling of top methods

    project perf
    run -i 3 -wi 10 -prof stack -jvmArgsAppend -Djmh.stack.lines=7
