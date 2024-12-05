package Q6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: c, reason: collision with root package name */
    final Method f9488c;

    /* renamed from: d, reason: collision with root package name */
    final Method f9489d;

    c(Method method, Method method2) {
        this.f9488c = method;
        this.f9489d = method2;
    }

    public static c r() {
        try {
            return new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // Q6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List b8 = f.b(list);
            this.f9488c.invoke(sSLParameters, b8.toArray(new String[b8.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw J6.c.a("unable to set ssl parameters", e8);
        }
    }

    @Override // Q6.f
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f9489d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw J6.c.a("unable to get selected protocols", e8);
        }
    }
}
