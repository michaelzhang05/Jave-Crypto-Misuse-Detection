package i.a;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* compiled from: ServiceInfo.java */
/* loaded from: classes2.dex */
public abstract class d implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f18272f = new byte[0];

    /* compiled from: ServiceInfo.java */
    /* loaded from: classes2.dex */
    public enum a {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract String d();

    public abstract String e();

    public abstract Inet4Address[] g();

    public abstract Inet6Address[] h();

    public abstract InetAddress[] i();

    public abstract String j();

    public abstract int k();

    public abstract int l();

    public abstract String m();

    public abstract String n();

    public abstract String p();

    public abstract String q();

    public abstract byte[] r();

    public abstract String s();

    public abstract int t();

    public abstract boolean u();

    public abstract boolean v(d dVar);

    public abstract boolean x();
}
