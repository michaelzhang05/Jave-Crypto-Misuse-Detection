package i.a;

import java.util.EventObject;

/* compiled from: ServiceEvent.java */
/* loaded from: classes2.dex */
public abstract class c extends EventObject implements Cloneable {
    public c(Object obj) {
        super(obj);
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract a c();

    public abstract d d();

    public abstract String e();

    public abstract String g();
}
