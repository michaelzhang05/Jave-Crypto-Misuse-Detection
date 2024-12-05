package p5;

import a5.I;
import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import b5.ResultReceiverC1979d;
import j6.C3205d;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3675o;
import org.json.JSONObject;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3780b {

    /* renamed from: a, reason: collision with root package name */
    private final ResultReceiverC1979d f37890a;

    /* renamed from: b, reason: collision with root package name */
    private HttpsURLConnection f37891b;

    /* renamed from: c, reason: collision with root package name */
    private OutputStream f37892c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37893d = "--";

    /* renamed from: e, reason: collision with root package name */
    private final String f37894e = "SwA" + System.currentTimeMillis() + "SwA";

    /* renamed from: f, reason: collision with root package name */
    private long f37895f;

    public C3780b(ResultReceiverC1979d resultReceiverC1979d) {
        this.f37890a = resultReceiverC1979d;
    }

    private final void k(String str, String str2) {
        if (this.f37890a != null) {
            String str3 = ((('\n' + this.f37893d + this.f37894e) + "\nContent-Type: text/plain") + "\nContent-Disposition: form-data; name=\"" + str + '\"') + '\n' + str2;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str3);
            this.f37890a.send(137, bundle);
        }
        OutputStream outputStream = this.f37892c;
        AbstractC3255y.f(outputStream);
        String str4 = this.f37893d + this.f37894e + "\r\n";
        Charset charset = C3205d.f34020b;
        byte[] bytes = str4.getBytes(charset);
        AbstractC3255y.h(bytes, "getBytes(...)");
        outputStream.write(bytes);
        OutputStream outputStream2 = this.f37892c;
        AbstractC3255y.f(outputStream2);
        byte[] bytes2 = "Content-Type: text/plain\r\n".getBytes(charset);
        AbstractC3255y.h(bytes2, "getBytes(...)");
        outputStream2.write(bytes2);
        OutputStream outputStream3 = this.f37892c;
        AbstractC3255y.f(outputStream3);
        byte[] bytes3 = ("Content-Disposition: form-data; name=\"" + str + "\"\r\n").getBytes(charset);
        AbstractC3255y.h(bytes3, "getBytes(...)");
        outputStream3.write(bytes3);
        OutputStream outputStream4 = this.f37892c;
        AbstractC3255y.f(outputStream4);
        byte[] bytes4 = ("\r\n" + str2 + "\r\n").getBytes(charset);
        AbstractC3255y.h(bytes4, "getBytes(...)");
        outputStream4.write(bytes4);
    }

    public final void a(String paramName, String fileName, byte[] bytes, JSONObject jSONObject) {
        String str;
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(fileName, "fileName");
        AbstractC3255y.i(bytes, "bytes");
        try {
            if (this.f37890a != null) {
                String str2 = (((('\n' + this.f37893d + this.f37894e) + "\nContent-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + '\"') + "\nContent-Type: application/octet-stream") + "\nContent-Transfer-Encoding: binary") + "\n----------Datos sin comprimir----------";
                if (jSONObject != null) {
                    str2 = str2 + '\n' + jSONObject.toString(2);
                }
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str2);
                this.f37890a.send(137, bundle);
            }
            OutputStream outputStream = this.f37892c;
            AbstractC3255y.f(outputStream);
            String str3 = this.f37893d + this.f37894e + "\r\n";
            Charset charset = C3205d.f34020b;
            byte[] bytes2 = str3.getBytes(charset);
            AbstractC3255y.h(bytes2, "getBytes(...)");
            outputStream.write(bytes2);
            OutputStream outputStream2 = this.f37892c;
            AbstractC3255y.f(outputStream2);
            byte[] bytes3 = ("Content-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + "\"\r\n").getBytes(charset);
            AbstractC3255y.h(bytes3, "getBytes(...)");
            outputStream2.write(bytes3);
            OutputStream outputStream3 = this.f37892c;
            AbstractC3255y.f(outputStream3);
            byte[] bytes4 = "Content-Type: application/octet-stream\r\n".getBytes(charset);
            AbstractC3255y.h(bytes4, "getBytes(...)");
            outputStream3.write(bytes4);
            OutputStream outputStream4 = this.f37892c;
            AbstractC3255y.f(outputStream4);
            byte[] bytes5 = "Content-Transfer-Encoding: binary\r\n".getBytes(charset);
            AbstractC3255y.h(bytes5, "getBytes(...)");
            outputStream4.write(bytes5);
            OutputStream outputStream5 = this.f37892c;
            AbstractC3255y.f(outputStream5);
            byte[] bytes6 = "\r\n".getBytes(charset);
            AbstractC3255y.h(bytes6, "getBytes(...)");
            outputStream5.write(bytes6);
            OutputStream outputStream6 = this.f37892c;
            AbstractC3255y.f(outputStream6);
            outputStream6.write(bytes, 0, bytes.length);
            OutputStream outputStream7 = this.f37892c;
            AbstractC3255y.f(outputStream7);
            byte[] bytes7 = "\r\n".getBytes(charset);
            AbstractC3255y.h(bytes7, "getBytes(...)");
            outputStream7.write(bytes7);
        } catch (IOException unused) {
            OutputStream outputStream8 = this.f37892c;
            AbstractC3255y.f(outputStream8);
            outputStream8.close();
        } catch (Exception e8) {
            if (this.f37890a != null) {
                if (e8.getMessage() != null) {
                    str = "\n\n********EXCEPTION********\n" + e8.getMessage();
                } else {
                    str = "\n\n********EXCEPTION********\n" + e8;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                this.f37890a.send(137, bundle2);
            }
            OutputStream outputStream9 = this.f37892c;
            AbstractC3255y.f(outputStream9);
            outputStream9.close();
        } catch (OutOfMemoryError e9) {
            if (this.f37890a != null) {
                String str4 = "\n\n********ERROR********";
                if (e9.getMessage() != null) {
                    str4 = "\n\n********ERROR********\n" + e9.getMessage() + ' ';
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString(NotificationCompat.CATEGORY_MESSAGE, str4);
                this.f37890a.send(137, bundle3);
            }
            OutputStream outputStream10 = this.f37892c;
            AbstractC3255y.f(outputStream10);
            outputStream10.close();
        }
    }

    public final long b(String paramName, String fileName, String str, long j8) {
        String str2;
        String str3;
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(fileName, "fileName");
        long j9 = 0;
        try {
            if (this.f37890a != null) {
                String str4 = ((((this.f37893d + this.f37894e) + "\nContent-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + '\"') + "\nContent-Type: application/octet-stream") + "\nContent-Transfer-Encoding: binary") + "\n----------Datos del fichero----------";
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str4);
                this.f37890a.send(137, bundle);
            }
            OutputStream outputStream = this.f37892c;
            AbstractC3255y.f(outputStream);
            String str5 = this.f37893d + this.f37894e + "\r\n";
            Charset charset = C3205d.f34020b;
            byte[] bytes = str5.getBytes(charset);
            AbstractC3255y.h(bytes, "getBytes(...)");
            outputStream.write(bytes);
            OutputStream outputStream2 = this.f37892c;
            AbstractC3255y.f(outputStream2);
            byte[] bytes2 = ("Content-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + "\"\r\n").getBytes(charset);
            AbstractC3255y.h(bytes2, "getBytes(...)");
            outputStream2.write(bytes2);
            OutputStream outputStream3 = this.f37892c;
            AbstractC3255y.f(outputStream3);
            byte[] bytes3 = "Content-Type: application/octet-stream\r\n".getBytes(charset);
            AbstractC3255y.h(bytes3, "getBytes(...)");
            outputStream3.write(bytes3);
            OutputStream outputStream4 = this.f37892c;
            AbstractC3255y.f(outputStream4);
            byte[] bytes4 = "Content-Transfer-Encoding: binary\r\n".getBytes(charset);
            AbstractC3255y.h(bytes4, "getBytes(...)");
            outputStream4.write(bytes4);
            OutputStream outputStream5 = this.f37892c;
            AbstractC3255y.f(outputStream5);
            byte[] bytes5 = "\r\n".getBytes(charset);
            AbstractC3255y.h(bytes5, "getBytes(...)");
            outputStream5.write(bytes5);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f37890a != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(NotificationCompat.CATEGORY_MESSAGE, ("\nFile size: " + j8) + "\nIni Send file: " + fileName + ' ' + currentTimeMillis);
                this.f37890a.send(137, bundle2);
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                OutputStream outputStream6 = this.f37892c;
                AbstractC3255y.f(outputStream6);
                outputStream6.write(bArr, 0, read);
                j9 += read;
            }
            fileInputStream.close();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.f37890a != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putString(NotificationCompat.CATEGORY_MESSAGE, ("\nFin Send file: " + fileName + ' ' + currentTimeMillis2) + "\nSend file duration: " + (currentTimeMillis2 - currentTimeMillis));
                this.f37890a.send(137, bundle3);
            }
            OutputStream outputStream7 = this.f37892c;
            AbstractC3255y.f(outputStream7);
            byte[] bytes6 = "\r\n".getBytes(C3205d.f34020b);
            AbstractC3255y.h(bytes6, "getBytes(...)");
            outputStream7.write(bytes6);
        } catch (IOException unused) {
            OutputStream outputStream8 = this.f37892c;
            if (outputStream8 != null) {
                outputStream8.close();
            }
        } catch (Exception e8) {
            if (this.f37890a != null) {
                if (e8.getMessage() != null) {
                    str3 = "\n\n********EXCEPTION********\n" + e8.getMessage();
                } else {
                    str3 = "\n\n********EXCEPTION********\n" + e8;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString(NotificationCompat.CATEGORY_MESSAGE, str3);
                this.f37890a.send(137, bundle4);
            }
            OutputStream outputStream9 = this.f37892c;
            if (outputStream9 != null) {
                outputStream9.close();
            }
        } catch (OutOfMemoryError e9) {
            if (this.f37890a != null) {
                if (e9.getMessage() != null) {
                    str2 = "\n\n********ERROR********\n" + e9.getMessage();
                } else {
                    str2 = "\n\n********ERROR********\n" + e9;
                }
                Bundle bundle5 = new Bundle();
                bundle5.putString(NotificationCompat.CATEGORY_MESSAGE, str2);
                this.f37890a.send(137, bundle5);
            }
            OutputStream outputStream10 = this.f37892c;
            if (outputStream10 != null) {
                outputStream10.close();
            }
        }
        return j9;
    }

    public final void c(String paramName, String value) {
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(value, "value");
        k(paramName, value);
    }

    public final void d(URL url, String str) {
        AbstractC3255y.i(url, "url");
        URLConnection openConnection = url.openConnection();
        AbstractC3255y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        this.f37891b = httpsURLConnection;
        AbstractC3255y.f(httpsURLConnection);
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        HttpsURLConnection httpsURLConnection2 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection2);
        httpsURLConnection2.setDoInput(true);
        HttpsURLConnection httpsURLConnection3 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection3);
        httpsURLConnection3.setDoOutput(true);
        HttpsURLConnection httpsURLConnection4 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection4);
        httpsURLConnection4.setRequestProperty("Connection", "Keep-Alive");
        HttpsURLConnection httpsURLConnection5 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection5);
        httpsURLConnection5.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.f37894e);
        HttpsURLConnection httpsURLConnection6 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection6);
        httpsURLConnection6.setRequestProperty("Accept-Charset", "utf-8");
        HttpsURLConnection httpsURLConnection7 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection7);
        httpsURLConnection7.setRequestProperty("Accept", "application/json");
        HttpsURLConnection httpsURLConnection8 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection8);
        httpsURLConnection8.setRequestProperty("Identificador", "Uptodown_Android");
        HttpsURLConnection httpsURLConnection9 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection9);
        httpsURLConnection9.setRequestProperty("apk_file", str);
        HttpsURLConnection httpsURLConnection10 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection10);
        httpsURLConnection10.setRequestProperty("Identificador-Version", "628");
        HttpsURLConnection httpsURLConnection11 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection11);
        httpsURLConnection11.setRequestProperty("APIKEY", C3655A.f36474a.e());
        C3779a c3779a = new C3779a();
        HttpsURLConnection httpsURLConnection12 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection12);
        httpsURLConnection12.setSSLSocketFactory(c3779a);
        C3675o c3675o = C3675o.f36526a;
        HttpsURLConnection httpsURLConnection13 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection13);
        c3675o.a(httpsURLConnection13);
        HttpsURLConnection httpsURLConnection14 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection14);
        httpsURLConnection14.setFixedLengthStreamingMode((int) this.f37895f);
        HttpsURLConnection httpsURLConnection15 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection15);
        httpsURLConnection15.connect();
        HttpsURLConnection httpsURLConnection16 = this.f37891b;
        AbstractC3255y.f(httpsURLConnection16);
        this.f37892c = httpsURLConnection16.getOutputStream();
    }

    public final void e() {
        if (this.f37890a != null) {
            String str = '\n' + this.f37893d + this.f37894e + this.f37893d;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            this.f37890a.send(137, bundle);
        }
        OutputStream outputStream = this.f37892c;
        AbstractC3255y.f(outputStream);
        byte[] bytes = (this.f37893d + this.f37894e + this.f37893d + "\r\n").getBytes(C3205d.f34020b);
        AbstractC3255y.h(bytes, "getBytes(...)");
        outputStream.write(bytes);
        OutputStream outputStream2 = this.f37892c;
        AbstractC3255y.f(outputStream2);
        outputStream2.close();
    }

    public final I f(boolean z8) {
        String str;
        InputStream errorStream;
        boolean z9;
        I i8 = new I();
        try {
            HttpsURLConnection httpsURLConnection = this.f37891b;
            AbstractC3255y.f(httpsURLConnection);
            int responseCode = httpsURLConnection.getResponseCode();
            i8.j(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                HttpsURLConnection httpsURLConnection2 = this.f37891b;
                AbstractC3255y.f(httpsURLConnection2);
                errorStream = httpsURLConnection2.getInputStream();
                if (errorStream == null) {
                    HttpsURLConnection httpsURLConnection3 = this.f37891b;
                    AbstractC3255y.f(httpsURLConnection3);
                    errorStream = httpsURLConnection3.getErrorStream();
                }
                z9 = true;
            } else {
                HttpsURLConnection httpsURLConnection4 = this.f37891b;
                AbstractC3255y.f(httpsURLConnection4);
                errorStream = httpsURLConnection4.getErrorStream();
                if (errorStream == null) {
                    HttpsURLConnection httpsURLConnection5 = this.f37891b;
                    AbstractC3255y.f(httpsURLConnection5);
                    errorStream = httpsURLConnection5.getInputStream();
                }
                z9 = false;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[1024];
            if (z9 && z8) {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(errorStream, new Inflater(true));
                while (true) {
                    int read = inflaterInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, C3205d.f34020b));
                }
                i8.i(sb.toString());
                inflaterInputStream.close();
            } else {
                while (true) {
                    int read2 = errorStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read2, C3205d.f34020b));
                }
                i8.i(sb.toString());
            }
            errorStream.close();
            HttpsURLConnection httpsURLConnection6 = this.f37891b;
            AbstractC3255y.f(httpsURLConnection6);
            httpsURLConnection6.disconnect();
        } catch (IOException e8) {
            if (this.f37890a != null) {
                if (e8.getMessage() != null) {
                    str = "********EXCEPTION********\n" + e8.getMessage();
                } else {
                    str = "********EXCEPTION********\n" + e8;
                }
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                this.f37890a.send(137, bundle);
            }
            if (e8.getMessage() != null) {
                i8.i(e8.getMessage());
            } else {
                i8.i(e8.toString());
            }
            i8.i(e8.getMessage());
        }
        return i8;
    }

    public final void g(String paramName, String fileName, byte[] bytes) {
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(fileName, "fileName");
        AbstractC3255y.i(bytes, "bytes");
        long length = this.f37895f + (this.f37893d + this.f37894e + "\r\n").length();
        this.f37895f = length;
        long j8 = 2;
        long length2 = length + ("Content-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + "\"\r\n").length() + 40 + 35 + j8;
        this.f37895f = length2;
        this.f37895f = length2 + ((long) bytes.length) + j8;
    }

    public final void h(String paramName, String fileName, long j8) {
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(fileName, "fileName");
        long length = this.f37895f + (this.f37893d + this.f37894e + "\r\n").length();
        this.f37895f = length;
        long j9 = 2;
        this.f37895f = length + ("Content-Disposition: form-data; name=\"" + paramName + "\"; filename=\"" + fileName + "\"\r\n").length() + 40 + 35 + j9 + j8 + j9;
    }

    public final void i() {
        this.f37895f = this.f37895f + (this.f37893d + this.f37894e + this.f37893d + "\r\n").length();
    }

    public final void j(String paramName, String value) {
        AbstractC3255y.i(paramName, "paramName");
        AbstractC3255y.i(value, "value");
        long length = this.f37895f + (this.f37893d + this.f37894e + "\r\n").length() + 26;
        this.f37895f = length;
        long length2 = length + ("Content-Disposition: form-data; name=\"" + paramName + "\"\r\n").length();
        this.f37895f = length2;
        this.f37895f = length2 + ("\r\n" + value + "\r\n").length();
    }
}
