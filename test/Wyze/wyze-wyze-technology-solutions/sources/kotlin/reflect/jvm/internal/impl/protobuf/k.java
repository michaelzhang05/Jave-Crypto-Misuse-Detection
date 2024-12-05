package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class k {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private f f21938b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f21939c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile o f21940d;

    protected void a(o oVar) {
        if (this.f21940d != null) {
            return;
        }
        synchronized (this) {
            if (this.f21940d != null) {
                return;
            }
            try {
                if (this.a != null) {
                    this.f21940d = oVar.h().d(this.a, this.f21938b);
                } else {
                    this.f21940d = oVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        if (this.f21939c) {
            return this.f21940d.e();
        }
        return this.a.size();
    }

    public o c(o oVar) {
        a(oVar);
        return this.f21940d;
    }

    public o d(o oVar) {
        o oVar2 = this.f21940d;
        this.f21940d = oVar;
        this.a = null;
        this.f21939c = true;
        return oVar2;
    }
}
