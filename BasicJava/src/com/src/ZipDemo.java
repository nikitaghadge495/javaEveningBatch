import java.io.*;
import java.util.zip.*;

class ZipDemo
{
	public static void main(String args[])
	{

		String sourceFile="C:\\java program\\fileData\\sample.txt";
		String zipFile="C:\\java program\\fileData\\output.zip";

		try{
			FileOutputStream fos=new FileOutputStream(zipFile);
			ZipOutputStream zos=new ZipOutputStream(fos);
			
			File fileToZip=new File(sourceFile);

			FileInputStream fis=new FileInputStream(fileToZip);

			ZipEntry zipentry=new ZipEntry(fileToZip.getName());

			zos.putNextEntry(zipentry);

			byte[] bytes=new byte[1024];

			int length;

			while((length= fis.read(bytes)) >= 0)
			{
				zos.write(bytes,0,length);
			}
			zos.close();
			fis.close();
			fos.close();

		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}