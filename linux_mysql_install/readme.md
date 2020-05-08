## linux에 mysql 설치


1\. version 확인
---

* linux : centos 7
mysql : 5.1.69

2\. linux update 
---

* <pre>
  <code># sudo yum update
  # sudo yum install wget</code>
  </pre>


3\. 유저생성 
---

* <pre>
  <code># useradd -M -s /bin/false mysql  </code>
  </pre>
  
4\. 권한생성
---
* <pre>
    <code>[root@divweb3 mysql]# cd /home 
    [root@divweb3 home]# mkdir mysql 
    [root@divweb3 home]# cd mysql 
    [root@divweb3 mysql]# mkdir data 
    [root@divweb3 mysql]# mkdir log 
    [root@divweb3 mysql]# chown mysql.mysql data/ 
    [root@divweb3 mysql]# chown mysql.mysql log/ </code>
    </pre>



4. MySQL 데이터 파일 및 로그파일 디렉토리 생성. 권한설정(MySQL 유저)


3. mysql 다운로드
<pre>
wget http://dev.mysql.com/get/Downloads/MySQL-5.1/mysql-5.1.69.tar.gz
</pre>


3\. my 압축풀기 
---

* <pre>
  <code>[root@divweb3 mysql]# cd /usr/local/src 
  [root@divweb3 src]# tar xvzf mysql-5.1.69.tar.gz 
  [root@divweb3 src]# cd mysql-5.1.69 
  [root@divweb3 mysql-5.1.69]# ./configure --prefix=/usr/local/mysql --datadir=/home/mysql/data --with-charset=utf8 --with-extra-charsets=complex</code>
  
  </pre>


3. 

