# Motivation

My good friend Seppel (@tuxBurner) is maintaining the SpringData-Neo4j-Plugin for the @playframework (https://github.com/tuxBurner/play-neo4jplugin).
On the other hand is Michael (@jexp) who visited us a several times in our java user group and we have a good relationship to him. He asked us how the plugin works with
the new SpringData-Neo4j in Version 4.0 and honestly we had not that much time to upgrade and test it. Therefore @tuxBurner receives a lot of traffic on his upgrade issue (https://github.com/tuxBurner/play-neo4jplugin/22).
Two weeks ago @jexp asked me if i could write an article about the @playframework, the new SpringData-Neo4j 4.1-M1 and @neo4j. I knew about the issues in the plugin and decided to do a fresh sample project.

## where is the class?
I had some issues with SDN 4.1 and my beloved ```ClassNotFoundException```. The problem at this point is, that the @playframework has it´s own special class loading mechanism which is really cool for this whole
class reloading magic during development. The problem with this magic is, that Class.forName(...) does not always works as expected. But...there was a github ticket according this issue https://github.com/spring-projects/spring-data-neo4j/issues/315
and i provided a possible solution for this fix, but then a problem with this reloading class loading mechanism and class caching came up and so on and so on. Long story short: Big thanks to @vince-bickers who
solved all my issues and wishes in SDN and OGM and finally everything is working as expected. Currently there it is only possible to access the changes in the SNAPSHOT build, but hey...we live in a dangerous world, lets use snapshots ;-)

# Introduction

# Neo4j & Spring Data

# Playframework

# ... the thing with dependency injection

# Conclusion
