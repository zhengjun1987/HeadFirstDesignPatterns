package chapter03;

import chapter01.MyUtils;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/25 10:06
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
        System.out.println(MyUtils.getCurrentTime() + "LowerCaseInputStream.LowerCaseInputStream  " + "in = [" + in + "]");
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return read < 0 ?read:Character.toLowerCase((char)read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = super.read(b, off, len);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) Character.toUpperCase(b[i]);
        }
        System.out.print(""+(char)read);
        return read;
    }
}
