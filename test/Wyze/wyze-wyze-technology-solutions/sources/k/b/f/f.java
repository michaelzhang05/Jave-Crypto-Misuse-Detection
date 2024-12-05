package k.b.f;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NamedLoggerBase.java */
/* loaded from: classes2.dex */
public abstract class f implements k.b.b, Serializable {

    /* renamed from: f, reason: collision with root package name */
    protected String f19441f;

    public String j() {
        return this.f19441f;
    }

    protected Object readResolve() throws ObjectStreamException {
        return k.b.c.i(j());
    }
}
