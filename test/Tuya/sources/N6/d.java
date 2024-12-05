package N6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class d extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Method f7530c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f7531d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f7532e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f7533f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f7534g;

    /* loaded from: classes5.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List f7535a;

        /* renamed from: b, reason: collision with root package name */
        boolean f7536b;

        /* renamed from: c, reason: collision with root package name */
        String f7537c;

        a(List list) {
            this.f7535a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = G6.c.f3221b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f7536b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f7535a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.f7535a.contains(list.get(i8))) {
                            String str = (String) list.get(i8);
                            this.f7537c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f7535a.get(0);
                    this.f7537c = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f7537c = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    d(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f7530c = method;
        this.f7531d = method2;
        this.f7532e = method3;
        this.f7533f = cls;
        this.f7534g = cls2;
    }

    public static f r() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // N6.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f7532e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw G6.c.a("unable to remove alpn", e8);
        }
    }

    @Override // N6.f
    public void f(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f7530c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f7533f, this.f7534g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw G6.c.a("unable to set alpn", e8);
        }
    }

    @Override // N6.f
    public String l(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f7531d.invoke(null, sSLSocket));
            boolean z8 = aVar.f7536b;
            if (!z8 && aVar.f7537c == null) {
                f.i().p(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z8) {
                return null;
            }
            return aVar.f7537c;
        } catch (IllegalAccessException e8) {
            e = e8;
            throw G6.c.a("unable to get selected protocol", e);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw G6.c.a("unable to get selected protocol", e);
        }
    }
}
