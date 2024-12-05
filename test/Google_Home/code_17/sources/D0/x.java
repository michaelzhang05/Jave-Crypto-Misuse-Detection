package D0;

import b1.InterfaceC1956b;

/* loaded from: classes3.dex */
public class x implements InterfaceC1956b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1766c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f1767a = f1766c;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC1956b f1768b;

    public x(InterfaceC1956b interfaceC1956b) {
        this.f1768b = interfaceC1956b;
    }

    @Override // b1.InterfaceC1956b
    public Object get() {
        Object obj = this.f1767a;
        Object obj2 = f1766c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1767a;
                    if (obj == obj2) {
                        obj = this.f1768b.get();
                        this.f1767a = obj;
                        this.f1768b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
