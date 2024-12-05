package kotlin.reflect.x.internal.l0.m;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.m.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class k implements f {
    private final String a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21415b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return yVar.f0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21416b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.x.internal.l0.m.f
        public boolean b(y yVar) {
            l.f(yVar, "functionDescriptor");
            return (yVar.f0() == null && yVar.m0() == null) ? false : true;
        }
    }

    private k(String str) {
        this.a = str;
    }

    public /* synthetic */ k(String str, g gVar) {
        this(str);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String a(y yVar) {
        return f.a.a(this, yVar);
    }

    @Override // kotlin.reflect.x.internal.l0.m.f
    public String getDescription() {
        return this.a;
    }
}
