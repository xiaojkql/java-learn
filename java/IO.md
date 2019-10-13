### 1
InputStream/OutputStream： 两种基本的IO流，两种基本的字节流
输入输出流以字节(byte)为基本单位,所以可以称之为字节流

Reader/Writer
读写的是字符
表示的是字符流
能自动编码的InputStream和OutputStream

Reader/Writer自动帮助我们进行了编码，常用于处理文本文件
InputStream/outputStream 处理的是 原生的字节流，需要我们自己进行编码

### 2 File对象
File和Path两个对象
只是创建和处理文件和目录，本身是不涉及输入输出内容的

### 3 InputStream
- read() 方法 返回读取的字节表示的int值(0-255, 字节为8位)，读取到末尾的时候返回-1

FileInputStream 从文件流中读取数据

try(resource)语句

缓冲

阻塞：在调用InputStream的read()方法读取数据时必须等待返回，此时被称为是阻塞的

一些类可以帮助进行测试比如ByteArrayInputStream将一个byte数组转换成一个输入流
