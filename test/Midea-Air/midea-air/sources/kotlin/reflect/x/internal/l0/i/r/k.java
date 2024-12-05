package kotlin.reflect.x.internal.l0.i.r;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.x.internal.l0.l.u1.h;
import kotlin.reflect.x.internal.l0.l.u1.j;
import kotlin.u;

/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public abstract class k extends g<u> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20873b = new a(null);

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final k a(String str) {
            l.f(str, "message");
            return new b(str);
        }
    }

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        private final String f20874c;

        public b(String str) {
            l.f(str, "message");
            this.f20874c = str;
        }

        @Override // kotlin.reflect.x.internal.l0.i.r.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public h a(g0 g0Var) {
            l.f(g0Var, "module");
            return kotlin.reflect.x.internal.l0.l.u1.k.d(j.m0, this.f20874c);
        }

        @Override // kotlin.reflect.x.internal.l0.i.r.g
        public String toString() {
            return this.f20874c;
        }
    }

    public k() {
        super(u.a);
    }

    @Override // kotlin.reflect.x.internal.l0.i.r.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u b() {
        throw new UnsupportedOperationException();
    }
}
