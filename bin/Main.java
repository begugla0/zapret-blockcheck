import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.util.LinkedList;
import java.util.List;
public class Main
{
    static String ipset_discord = "5.200.14.249\r\n18.165.140.0/25\r\n23.227.38.74\r\n34.0.48.0/24\r\n34.0.49.64/26\r\n34.0.50.0/25\r\n34.0.51.0/24\r\n34.0.52.0/22\r\n34.0.56.0/23\r\n34.0.59.0/24\r\n34.0.60.0/24\r\n34.0.62.128/25\r\n34.0.63.228\r\n34.0.64.0/23\r\n34.0.66.130\r\n34.0.82.140\r\n34.0.129.128/25\r\n34.0.130.0/24\r\n34.0.131.130\r\n34.0.132.139\r\n34.0.133.75\r\n34.0.134.0/24\r\n34.0.135.251\r\n34.0.136.51\r\n34.0.137.0/24\r\n34.0.139.0/24\r\n34.0.140.0/23\r\n34.0.142.0/25\r\n34.0.144.0/23\r\n34.0.146.0/24\r\n34.0.148.25\r\n34.0.149.101\r\n34.0.151.0/25\r\n34.0.153.0/24\r\n34.0.155.0/24\r\n34.0.156.101\r\n34.0.157.0/25\r\n34.0.158.247\r\n34.0.159.188\r\n34.0.192.0/25\r\n34.0.193.0/24\r\n34.0.194.0/24\r\n34.0.195.172\r\n34.0.196.200/29\r\n34.0.197.81\r\n34.0.198.25\r\n34.0.199.0/24\r\n34.0.200.0/24\r\n34.0.201.81\r\n34.0.202.34\r\n34.0.203.0/24\r\n34.0.204.0/23\r\n34.0.206.0/25\r\n34.0.207.0/25\r\n34.0.208.195\r\n34.0.209.0/24\r\n34.0.210.20\r\n34.0.211.0/26\r\n34.0.212.0/24\r\n34.0.213.64/26\r\n34.0.215.128/25\r\n34.0.216.238\r\n34.0.217.0/24\r\n34.0.218.83\r\n34.0.220.103\r\n34.0.221.0/24\r\n34.0.222.193\r\n34.0.223.68\r\n34.0.227.0/24\r\n34.0.240.0/21\r\n34.0.248.0/23\r\n34.0.250.0/24\r\n34.0.251.0/25\r\n34.1.216.0/24\r\n34.1.221.166\r\n35.207.64.0/23\r\n35.207.67.116\r\n35.207.71.0/24\r\n35.207.72.32\r\n35.207.73.0/24\r\n35.207.74.0/24\r\n35.207.75.128/25\r\n35.207.76.128/26\r\n35.207.77.0/24\r\n35.207.78.129\r\n35.207.79.0/24\r\n35.207.80.76\r\n35.207.81.248/30\r\n35.207.82.0/23\r\n35.207.84.0/24\r\n35.207.85.160\r\n35.207.86.41\r\n35.207.87.184\r\n35.207.89.188\r\n35.207.91.146\r\n35.207.92.230\r\n35.207.95.0/24\r\n35.207.97.174\r\n35.207.99.134\r\n35.207.100.64/26\r\n35.207.101.130\r\n35.207.103.64/26\r\n35.207.104.0/24\r\n35.207.106.128/26\r\n35.207.107.19\r\n35.207.108.192/27\r\n35.207.109.185\r\n35.207.110.0/24\r\n35.207.111.174\r\n35.207.114.16\r\n35.207.115.163\r\n35.207.116.51\r\n35.207.117.0/24\r\n35.207.121.204\r\n35.207.122.0/25\r\n35.207.124.145\r\n35.207.125.116\r\n35.207.126.30\r\n35.207.129.0/24\r\n35.207.131.128/27\r\n35.207.132.247\r\n35.207.135.147\r\n35.207.136.69\r\n35.207.137.0/24\r\n35.207.139.0/24\r\n35.207.140.241\r\n35.207.141.119\r\n35.207.142.0/24\r\n35.207.143.96/27\r\n35.207.144.0/25\r\n35.207.145.0/24\r\n35.207.146.89\r\n35.207.147.0/24\r\n35.207.149.0/24\r\n35.207.150.0/24\r\n35.207.151.61\r\n35.207.153.117\r\n35.207.154.0/24\r\n35.207.155.128/25\r\n35.207.156.254\r\n35.207.157.7\r\n35.207.158.192\r\n35.207.160.160\r\n35.207.162.239\r\n35.207.163.0/24\r\n35.207.164.0/25\r\n35.207.165.147\r\n35.207.166.0/25\r\n35.207.167.0/24\r\n35.207.168.116\r\n35.207.170.0/23\r\n35.207.172.0/24\r\n35.207.174.55\r\n35.207.176.128/25\r\n35.207.178.0/24\r\n35.207.180.152\r\n35.207.181.76\r\n35.207.182.125\r\n35.207.184.101\r\n35.207.185.192\r\n35.207.186.128/25\r\n35.207.187.228\r\n35.207.188.0/24\r\n35.207.189.0/25\r\n35.207.190.194\r\n35.207.191.64/26\r\n35.207.193.165\r\n35.207.195.75\r\n35.207.196.0/24\r\n35.207.198.0/23\r\n35.207.201.186\r\n35.207.202.169\r\n35.207.205.211\r\n35.207.207.4\r\n35.207.209.0/25\r\n35.207.210.191\r\n35.207.211.253\r\n35.207.213.97\r\n35.207.214.0/24\r\n35.207.220.147\r\n35.207.221.58\r\n35.207.222.105\r\n35.207.224.151\r\n35.207.225.210\r\n35.207.227.0/24\r\n35.207.229.212\r\n35.207.232.26\r\n35.207.234.182\r\n35.207.238.0/24\r\n35.207.240.0/24\r\n35.207.245.0/24\r\n35.207.249.0/24\r\n35.207.250.212\r\n35.207.251.0/27\r\n35.212.4.134\r\n35.212.12.148\r\n35.212.88.11\r\n35.212.102.50\r\n35.212.111.0/26\r\n35.212.117.247\r\n35.212.120.122\r\n35.213.0.0/24\r\n35.213.2.8\r\n35.213.4.185\r\n35.213.6.118\r\n35.213.7.128/25\r\n35.213.8.168\r\n35.213.10.0/24\r\n35.213.11.21\r\n35.213.12.224/27\r\n35.213.13.19\r\n35.213.14.217\r\n35.213.16.67\r\n35.213.17.235\r\n35.213.23.166\r\n35.213.25.164\r\n35.213.26.62\r\n35.213.27.252\r\n35.213.32.0/24\r\n35.213.33.74\r\n35.213.34.204\r\n35.213.37.81\r\n35.213.38.186\r\n35.213.39.253\r\n35.213.42.0/24\r\n35.213.43.79\r\n35.213.45.0/24\r\n35.213.46.136\r\n35.213.49.17\r\n35.213.50.0/24\r\n35.213.51.213\r\n35.213.52.0/25\r\n35.213.53.0/24\r\n35.213.54.0/24\r\n35.213.56.0/25\r\n35.213.59.0/24\r\n35.213.61.58\r\n35.213.65.0/24\r\n35.213.67.0/24\r\n35.213.68.192/26\r\n35.213.70.151\r\n35.213.72.128/25\r\n35.213.73.245\r\n35.213.74.131\r\n35.213.78.0/24\r\n35.213.79.137\r\n35.213.80.0/25\r\n35.213.83.128/25\r\n35.213.84.245\r\n35.213.85.0/24\r\n35.213.88.145\r\n35.213.89.80/28\r\n35.213.90.0/24\r\n35.213.91.195\r\n35.213.92.0/24\r\n35.213.93.254\r\n35.213.94.78\r\n35.213.95.145\r\n35.213.96.87\r\n35.213.98.0/24\r\n35.213.99.126\r\n35.213.101.214\r\n35.213.102.0/24\r\n35.213.105.0/24\r\n35.213.106.128/25\r\n35.213.107.158\r\n35.213.109.0/24\r\n35.213.110.40\r\n35.213.111.0/25\r\n35.213.115.0/25\r\n35.213.120.0/24\r\n35.213.122.0/24\r\n35.213.124.89\r\n35.213.125.40\r\n35.213.126.185\r\n35.213.127.0/24\r\n35.213.128.0/22\r\n35.213.132.0/23\r\n35.213.134.140\r\n35.213.135.0/24\r\n35.213.136.0/23\r\n35.213.138.128/25\r\n35.213.139.0/24\r\n35.213.140.0/25\r\n35.213.141.164\r\n35.213.142.128/25\r\n35.213.143.0/24\r\n35.213.144.0/22\r\n35.213.148.0/23\r\n35.213.150.0/24\r\n35.213.152.0/23\r\n35.213.154.137\r\n35.213.155.134\r\n35.213.156.144\r\n35.213.157.0/24\r\n35.213.158.64/26\r\n35.213.160.90\r\n35.213.161.253\r\n35.213.162.0/25\r\n35.213.163.0/24\r\n35.213.164.0/23\r\n35.213.166.106\r\n35.213.167.160/27\r\n35.213.168.0/24\r\n35.213.169.179\r\n35.213.170.0/24\r\n35.213.171.201\r\n35.213.172.159\r\n35.213.173.0/24\r\n35.213.174.128/25\r\n35.213.175.128/26\r\n35.213.176.0/24\r\n35.213.177.0/25\r\n35.213.179.139\r\n35.213.180.0/24\r\n35.213.181.0/25\r\n35.213.182.0/23\r\n35.213.184.0/23\r\n35.213.186.70\r\n35.213.187.0/24\r\n35.213.188.128/25\r\n35.213.190.158\r\n35.213.191.0/24\r\n35.213.192.240/31\r\n35.213.193.74\r\n35.213.194.0/25\r\n35.213.195.178\r\n35.213.196.38\r\n35.213.197.68\r\n35.213.198.0/23\r\n35.213.200.0/23\r\n35.213.202.0/25\r\n35.213.203.195\r\n35.213.204.32/27\r\n35.213.205.170\r\n35.213.207.128/25\r\n35.213.208.85\r\n35.213.210.0/24\r\n35.213.211.176/29\r\n35.213.212.0/24\r\n35.213.213.225\r\n35.213.214.0/25\r\n35.213.215.255\r\n35.213.217.0/24\r\n35.213.218.248\r\n35.213.219.0/25\r\n35.213.220.211\r\n35.213.221.0/24\r\n35.213.222.215\r\n35.213.223.0/24\r\n35.213.225.0/24\r\n35.213.227.227\r\n35.213.229.17\r\n35.213.230.89\r\n35.213.231.0/24\r\n35.213.233.0/24\r\n35.213.234.134\r\n35.213.236.0/24\r\n35.213.237.212\r\n35.213.238.0/24\r\n35.213.240.212\r\n35.213.241.0/24\r\n35.213.242.10\r\n35.213.243.219\r\n35.213.244.146\r\n35.213.245.119\r\n35.213.246.0/23\r\n35.213.249.79\r\n35.213.250.0/24\r\n35.213.251.74\r\n35.213.252.0/24\r\n35.213.253.155\r\n35.213.254.89\r\n35.214.128.248\r\n35.214.129.220\r\n35.214.130.217\r\n35.214.131.144\r\n35.214.132.189\r\n35.214.133.0/24\r\n35.214.134.163\r\n35.214.137.0/24\r\n35.214.138.0/25\r\n35.214.140.0/24\r\n35.214.142.0/24\r\n35.214.143.41\r\n35.214.144.26\r\n35.214.145.200\r\n35.214.146.9\r\n35.214.147.135\r\n35.214.148.89\r\n35.214.149.110\r\n35.214.151.128/25\r\n35.214.152.0/24\r\n35.214.156.115\r\n35.214.158.181\r\n35.214.159.128/25\r\n35.214.160.128/25\r\n35.214.161.217\r\n35.214.162.0/24\r\n35.214.163.28\r\n35.214.165.102\r\n35.214.167.77\r\n35.214.169.0/24\r\n35.214.170.2\r\n35.214.171.0/25\r\n35.214.172.128/25\r\n35.214.173.0/24\r\n35.214.175.0/24\r\n35.214.177.183\r\n35.214.179.46\r\n35.214.180.0/23\r\n35.214.184.179\r\n35.214.185.28\r\n35.214.186.3\r\n35.214.187.0/24\r\n35.214.191.0/24\r\n35.214.192.128/25\r\n35.214.193.0/24\r\n35.214.194.128/25\r\n35.214.195.0/25\r\n35.214.196.64/26\r\n35.214.197.0/24\r\n35.214.198.7\r\n35.214.199.224\r\n35.214.201.0/25\r\n35.214.203.155\r\n35.214.204.0/23\r\n35.214.207.0/24\r\n35.214.208.128/25\r\n35.214.209.64\r\n35.214.210.0/24\r\n35.214.211.3\r\n35.214.212.64/26\r\n35.214.213.0/25\r\n35.214.214.0/24\r\n35.214.215.64/26\r\n35.214.216.0/23\r\n35.214.218.140\r\n35.214.219.0/24\r\n35.214.220.149\r\n35.214.221.0/24\r\n35.214.222.149\r\n35.214.223.0/24\r\n35.214.224.71\r\n35.214.225.0/24\r\n35.214.226.0/23\r\n35.214.228.0/23\r\n35.214.231.187\r\n35.214.233.8\r\n35.214.235.38\r\n35.214.237.0/24\r\n35.214.238.0/25\r\n35.214.239.0/24\r\n35.214.240.87\r\n35.214.241.0/24\r\n35.214.243.21\r\n35.214.244.0/24\r\n35.214.245.16/28\r\n35.214.246.106\r\n35.214.248.119\r\n35.214.249.154\r\n35.214.250.0/24\r\n35.214.251.128/25\r\n35.214.252.187\r\n35.214.253.0/24\r\n35.214.255.154\r\n35.215.72.85\r\n35.215.73.65\r\n35.215.83.0\r\n35.215.108.111\r\n35.215.115.120\r\n35.215.126.35\r\n35.215.127.34\r\n35.215.128.0/21\r\n35.215.136.0/26\r\n35.215.137.0/24\r\n35.215.138.0/23\r\n35.215.140.0/24\r\n35.215.141.64/27\r\n35.215.142.0/24\r\n35.215.143.83\r\n35.215.144.128/25\r\n35.215.145.0/24\r\n35.215.146.0/24\r\n35.215.147.86\r\n35.215.148.0/23\r\n35.215.150.0/26\r\n35.215.151.0/24\r\n35.215.152.0/24\r\n35.215.153.128/25\r\n35.215.154.240/28\r\n35.215.155.20\r\n35.215.156.0/24\r\n35.215.158.0/23\r\n35.215.160.192/26\r\n35.215.161.0/24\r\n35.215.163.0/24\r\n35.215.164.0/24\r\n35.215.165.236\r\n35.215.166.128/25\r\n35.215.167.128/25\r\n35.215.168.0/24\r\n35.215.169.12\r\n35.215.170.0/23\r\n35.215.172.0/22\r\n35.215.176.0/24\r\n35.215.177.72\r\n35.215.178.0/24\r\n35.215.179.161\r\n35.215.180.0/22\r\n35.215.184.253\r\n35.215.185.64/26\r\n35.215.186.0/25\r\n35.215.187.0/24\r\n35.215.188.0/23\r\n35.215.190.0/24\r\n35.215.191.61\r\n35.215.192.0/23\r\n35.215.194.192/28\r\n35.215.195.0/24\r\n35.215.196.0/25\r\n35.215.197.0/25\r\n35.215.198.230\r\n35.215.199.204\r\n35.215.200.0/23\r\n35.215.202.0/24\r\n35.215.203.0/25\r\n35.215.204.128/25\r\n35.215.205.0/25\r\n35.215.206.0/23\r\n35.215.208.0/24\r\n35.215.209.0/25\r\n35.215.210.0/23\r\n35.215.212.0/22\r\n35.215.216.0/22\r\n35.215.221.0/24\r\n35.215.222.128/25\r\n35.215.223.126\r\n35.215.224.0/23\r\n35.215.226.0/24\r\n35.215.227.0/25\r\n35.215.228.0/24\r\n35.215.229.64\r\n35.215.230.89\r\n35.215.231.0/24\r\n35.215.232.0/24\r\n35.215.233.0/25\r\n35.215.234.37\r\n35.215.235.0/24\r\n35.215.238.0/25\r\n35.215.239.119\r\n35.215.240.0/24\r\n35.215.241.128/25\r\n35.215.242.0/25\r\n35.215.243.0/24\r\n35.215.244.0/23\r\n35.215.246.222\r\n35.215.247.0/24\r\n35.215.248.0/22\r\n35.215.252.0/24\r\n35.215.253.118\r\n35.215.254.0/23\r\n35.217.0.0/24\r\n35.217.1.64/26\r\n35.217.2.5\r\n35.217.3.0/24\r\n35.217.4.72\r\n35.217.5.0/25\r\n35.217.6.0/24\r\n35.217.8.0/25\r\n35.217.9.0/24\r\n35.217.11.186\r\n35.217.12.0/24\r\n35.217.14.192/26\r\n35.217.15.65\r\n35.217.16.75\r\n35.217.17.128/25\r\n35.217.18.0/24\r\n35.217.19.183\r\n35.217.20.0/24\r\n35.217.21.128/25\r\n35.217.22.128/25\r\n35.217.23.128/25\r\n35.217.24.0/24\r\n35.217.25.81\r\n35.217.26.0/24\r\n35.217.27.128/25\r\n35.217.28.128/25\r\n35.217.29.0/24\r\n35.217.30.0/25\r\n35.217.31.0/25\r\n35.217.32.128/25\r\n35.217.33.0/24\r\n35.217.35.128/25\r\n35.217.36.0/23\r\n35.217.38.179\r\n35.217.39.186\r\n35.217.40.176\r\n35.217.41.204\r\n35.217.43.0/24\r\n35.217.45.248\r\n35.217.46.0/24\r\n35.217.47.128/25\r\n35.217.48.195\r\n35.217.49.160/27\r\n35.217.50.0/25\r\n35.217.51.0/24\r\n35.217.52.117\r\n35.217.53.128/25\r\n35.217.54.0/25\r\n35.217.55.96/27\r\n35.217.56.6\r\n35.217.57.184\r\n35.217.58.0/24\r\n35.217.59.64/26\r\n35.217.60.0/24\r\n35.217.61.128/25\r\n35.217.62.0/24\r\n35.217.63.128/25\r\n35.219.225.149\r\n35.219.226.57\r\n35.219.227.0/24\r\n35.219.228.37\r\n35.219.229.128/25\r\n35.219.230.0/23\r\n35.219.235.0/24\r\n35.219.236.198\r\n35.219.238.115\r\n35.219.239.0/24\r\n35.219.241.0/24\r\n35.219.242.221\r\n35.219.243.191\r\n35.219.244.1\r\n35.219.245.0/24\r\n35.219.246.159\r\n35.219.247.0/26\r\n35.219.248.0/24\r\n35.219.249.126\r\n35.219.251.186\r\n35.219.252.0/23\r\n35.219.254.0/24\r\n64.233.161.207\r\n64.233.162.207\r\n64.233.163.207\r\n64.233.164.207\r\n64.233.165.207\r\n66.22.196.0/26\r\n66.22.197.0/24\r\n66.22.198.0/26\r\n66.22.199.0/24\r\n66.22.200.0/26\r\n66.22.202.0/26\r\n66.22.204.0/24\r\n66.22.206.0/24\r\n66.22.208.0/25\r\n66.22.210.0/26\r\n66.22.212.0/24\r\n66.22.214.0/24\r\n66.22.216.0/23\r\n66.22.220.0/25\r\n66.22.221.0/24\r\n66.22.222.0/23\r\n66.22.224.0/25\r\n66.22.225.0/26\r\n66.22.226.0/25\r\n66.22.227.0/25\r\n66.22.228.0/22\r\n66.22.233.0/24\r\n66.22.234.0/24\r\n66.22.236.0/23\r\n66.22.238.0/24\r\n66.22.240.0/22\r\n66.22.244.0/23\r\n66.22.248.0/24\r\n74.125.131.207\r\n74.125.205.207\r\n104.17.51.93\r\n104.17.117.93\r\n104.18.4.161\r\n104.18.5.161\r\n104.18.8.105\r\n104.18.9.105\r\n104.18.30.128\r\n104.18.31.128\r\n104.21.2.204\r\n104.21.25.51\r\n104.21.40.151\r\n104.21.59.128\r\n104.21.72.221\r\n104.21.82.160\r\n108.177.14.207\r\n138.128.140.240/28\r\n142.250.150.207\r\n142.251.1.207\r\n162.159.128.232/30\r\n162.159.129.232/30\r\n162.159.130.232/30\r\n162.159.133.232/30\r\n162.159.134.232/30\r\n162.159.135.232/30\r\n162.159.136.232/30\r\n162.159.137.232/30\r\n162.159.138.232/30\r\n172.65.202.19\r\n172.66.41.34\r\n172.66.42.222\r\n172.67.152.224/28\r\n172.67.155.163\r\n172.67.159.89\r\n172.67.177.131\r\n172.67.222.182\r\n173.194.73.207\r\n173.194.220.207\r\n173.194.221.207\r\n173.194.222.207\r\n188.114.96.2\r\n188.114.97.2\r\n188.114.98.224\r\n188.114.99.224\r\n204.11.56.48\r\n209.85.233.207\r\n"; 
    static String list_discord = "discord.com\r\ngateway.discord.gg\r\ncdn.discordapp.com\r\ndiscordapp.net\r\ndiscordapp.com\r\ndiscord.gg\r\nmedia.discordapp.net\r\nimages-ext-1.discordapp.net\r\ndiscord.app\r\ndiscord.media\r\ndiscordcdn.com\r\ndiscord.dev\r\ndiscord.new\r\ndiscord.gift\r\ndiscordstatus.com\r\ndis.gd\r\ndiscord.co\r\ndiscord-attachments-uploads-prd.storage.googleapis.com\r\ncloudflare-ech.com";
    static String list_youtube = "googlevideo.com\r\nyoutubei.googleapis.com\r\nytimg.com\r\nyt3.ggpht.com\r\nyt4.ggpht.com\r\nyoutube.com\r\nyoutubeembeddedplayer.googleapis.com\r\nytimg.l.google.com\r\njnn-pa.googleapis.com\r\nyoutube-nocookie.com\r\nyoutube-ui.l.google.com\r\nyt-video-upload.l.google.com\r\nwide-youtube.l.google.com";
    static String stopbat = "@echo off\r\nchcp 1251\r\n\r\n:init\r\n set \"batchPath=%~dpnx0\"\r\n set BIN=%~dp0bin\\\r\n set \"vbsGetPrivileges=%BIN%\\elevator.vbs\"\r\n setlocal EnableDelayedExpansion\r\n\r\n if '%1'=='ELEV' (echo ELEV & shift /1 & goto fileRemove)\r\n ECHO Set UAC = CreateObject^(\"Shell.Application\"^) > \"%vbsGetPrivileges%\"\r\n ECHO args = \"ELEV \" >> \"%vbsGetPrivileges%\"\r\n ECHO For Each strArg in WScript.Arguments >> \"%vbsGetPrivileges%\"\r\n ECHO args = args ^& strArg ^& \" \"  >> \"%vbsGetPrivileges%\"\r\n ECHO Next >> \"%vbsGetPrivileges%\"\r\n ECHO args = \"/c \"\"\" + \"!batchPath!\" + \"\"\" \" + args >> \"%vbsGetPrivileges%\"\r\n ECHO UAC.ShellExecute \"%SystemRoot%\\System32\\cmd.exe\", args, \"\", \"runas\", 1 >> \"%vbsGetPrivileges%\"\r\n \"%SystemRoot%\\System32\\WScript.exe\" \"%vbsGetPrivileges%\" %*\r\n exit /B\r\n\r\n:fileRemove\r\n del \"%vbsGetPrivileges%\" 1>nul 2>nul  &  shift /1\r\n\r\nsc delete windivert\r\nsc stop windivert\r\npause";
    public static void main(String[] args)
    {
        CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
        File File = new File(codeSource.getLocation().getPath());
        String path = "none";
        try { path = new String(File.getParentFile().getPath().replace("\\bin", "").getBytes("WINDOWS-1251"));} catch(Exception e) {}
        path = path.replace("%20", " ");
        System.out.println(path);
        File ipset_discord_file = new File(String.format("%s\\ipset-discord.txt", path));
        File list_discord_file = new File(String.format("%s\\list-discord.txt", path));
        File list_youtube_file = new File(String.format("%s\\list-youtube.txt", path));
        File stopbat_file = new File(String.format("%s\\stop.bat", path));
        File start_file = new File(String.format("%s\\Blockcheck.bat", path));
        File script_file = new File(String.format("%s\\bin\\Main.java", path));
        Process childProcess;
        File[] generals;
        String[] command = {String.format("%s\\bundle-master\\cygwin\\bin\\bash.exe", path), "-i", String.format("%s\\bundle-master\\blockcheck\\zapret\\blog.sh", path)};
        BufferedReader stdInput;
        BufferedWriter stdOutput;
        List<String> lines;
        LinkedList<String> strats = new LinkedList<>();
        try 
        {
            if (ipset_discord_file.createNewFile())
            {
                System.out.println("ipset-discord.txt created");
                Files.write(ipset_discord_file.toPath(), ipset_discord.getBytes());
            }
            else
            {System.out.println("ipset-discord.txt already exists");}
            if (list_discord_file.createNewFile())
            {
                System.out.println("list-discord.txt created");
                Files.write(list_discord_file.toPath(), list_discord.getBytes());
            }
            else
            {System.out.println("list-discord.txt already exists");}
            if (list_youtube_file.createNewFile())
            {
                System.out.println("list-youtube.txt created");
                Files.write(list_youtube_file.toPath(), list_youtube.getBytes());
            }
            else
            {System.out.println("list-youtube.txt already exists");}
            if (stopbat_file.createNewFile())
            {
                System.out.println("stop.bat created");
                Files.write(stopbat_file.toPath(), stopbat.getBytes());
            }
            else
            {System.out.println("stop.bat already exists");}
            System.out.println("Starting blockcheck...");
            childProcess = new ProcessBuilder(command).start();
            stdInput = new BufferedReader(new InputStreamReader(childProcess.getInputStream()));
            stdOutput = new BufferedWriter(new OutputStreamWriter(childProcess.getOutputStream()));
            String line;
            boolean write = true;
            while (!(line = stdInput.readLine()).equals("press enter to continue")) 
            { 
                if (line.equals("* SUMMARY")) 
                    write = false;
                stdOutput.write("\n");
                stdOutput.flush();
                if (write)
                    System.out.println(line);
            }
            childProcess.waitFor();
            childProcess.destroy();
            lines = Files.lines(Paths.get(String.format("%s\\bundle-master\\blockcheck\\blockcheck.log", path))).toList();
            boolean flag = false;
            for (int i = 0; i < lines.size(); i++) 
            {
                if (lines.get(i).equals("* SUMMARY"))
                {
                    flag = true;
                    continue;
                }
                if (lines.get(i).equals(""))
                {
                    flag = false;
                    continue;
                }
                if (flag && lines.get(i).contains("winws "))
                {
                    String[] parts = lines.get(i).split("winws ");
                    if (!parts[1].contains("/"))
                        strats.add(parts[1]);
                }
            }
            System.out.println(strats.size() + " valuable strategies");
            generals = new File[strats.size()];
            for (int i = 0; i < strats.size(); i++)
            {
                System.out.println("\n" + strats.get(i));
                generals[i] = new File(String.format("%s\\general_%d.bat", path, i));
                if (generals[i].createNewFile())
                {
                    System.out.println(String.format("general_%d.bat created", i));
                    Files.write(generals[i].toPath(), ("@echo off\r\nchcp 65001 >nul\r\n:: 65001 - UTF-8\r\n\r\ncd /d \"%~dp0\"\r\necho:\r\n\r\nset BIN=%~dp0bin\\\r\n\r\nstart \"zapret: general\" /min \"%BIN%winws.exe\" "+ strats.get(i) +" ^\r\n--wf-tcp=80,443 --wf-udp=443,50000-50099 ^\r\n--filter-tcp=80 --dpi-desync=fake,fakedsplit --dpi-desync-autottl=2 --dpi-desync-fooling=md5sig --new ^\r\n--filter-tcp=443 --hostlist=\"list-youtube.txt\" --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=md5sig --dpi-desync-fake-tls=\"%BIN%tls_clienthello_www_google_com.bin\" --new ^\r\n--filter-tcp=443 --dpi-desync=fake,multidisorder --dpi-desync-split-pos=midsld --dpi-desync-repeats=6 --dpi-desync-fooling=badseq,md5sig --new ^\r\n--filter-udp=443 --hostlist=\"list-youtube.txt\" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic=\"%BIN%quic_initial_www_google_com.bin\" --new ^\r\n--filter-udp=443 --dpi-desync=fake --dpi-desync-repeats=11 ^ --new ^\r\n--filter-udp=50000-50099 --ipset=\"ipset-discord.txt\" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-any-protocol --dpi-desync-cutoff=n4\r\n\r\n").getBytes());
                }
                else
                {System.out.println(String.format("Can't create a file general_%d\n", i));}
            }
            System.out.println("\nPress ENTER to continue\n");
            System.console().readLine();
            //start_file.delete();
            //script_file.delete();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}