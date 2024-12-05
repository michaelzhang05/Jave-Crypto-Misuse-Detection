package N6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: c, reason: collision with root package name */
    final Method f7528c;

    /* renamed from: d, reason: collision with root package name */
    final Method f7529d;

    c(Method method, Method method2) {
        this.f7528c = method;
        this.f7529d = method2;
    }

    public static c r() {
        try {
            return new c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // N6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List b8 = f.b(list);
            this.f7528c.invoke(sSLParameters, b8.toArray(new String[b8.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw G6.c.a("unable to set ssl parameters", e8);
        }
    }

    @Override // N6.f
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f7529d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw G6.c.a("unable to get selected protocols", e8);
        }
    }
}
