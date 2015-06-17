 #!/bin/sh

 EMS_SUNHAO=git@git.sunhao.com:s-ems/s-ems.git
 EMS_OSC=git@git.oschina.net:sunhao-java/S-EMS.git
 EMS_GITHUB=git@github.com:sunhao-java/S-EMS.git

 # checkout
 git clone $EMS_SUNHAO S-EMS

 cd S-EMS

 # 取出分支
 git checkout develop

 # 删除远程地址
 git remote remove origin

 # 添加3个远程地址
 git remote add sunhao $EMS_SUNHAO
 git remote add osc $EMS_OSC
 git remote add github $EMS_GITHUB
