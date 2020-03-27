# Judger
Wrapped libjudger.so in Java for easy calling.

> Need dynamic library from qduoj judger and seccomp, only for linux x64 platform.

#### Usage

- install

```bash
# install depencies
sudo apt-get install libseccomp-dev
git clone https://github.com/rjm521/Judger.git
cd Judger
# move the dynamic library
sudo mkdir /usr/lib/judger
sudo mv libjudger.so /usr/lib/judger/libjudger.so
```
- see example

```bash
javac test.java Config.java Judger.java
java test
```
