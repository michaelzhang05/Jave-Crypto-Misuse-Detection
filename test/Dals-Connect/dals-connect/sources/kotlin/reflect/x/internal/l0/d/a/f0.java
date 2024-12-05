package kotlin.reflect.x.internal.l0.d.a;

import cm.aptoide.pt.dataprovider.model.v7.Malware;
import kotlin.jvm.internal.g;

/* compiled from: ReportLevel.kt */
/* loaded from: classes2.dex */
public enum f0 {
    IGNORE("ignore"),
    WARN(Malware.WARN),
    STRICT("strict");


    /* renamed from: f, reason: collision with root package name */
    public static final a f19874f = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final String f19879k;

    /* compiled from: ReportLevel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    f0(String str) {
        this.f19879k = str;
    }

    public final String f() {
        return this.f19879k;
    }

    public final boolean i() {
        return this == IGNORE;
    }

    public final boolean n() {
        return this == WARN;
    }
}
