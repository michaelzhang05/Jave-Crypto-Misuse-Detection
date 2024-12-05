package kotlin.reflect.x.internal.l0.j.b;

import kotlin.Pair;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.z.g;

/* compiled from: ContractDeserializer.kt */
/* loaded from: classes2.dex */
public interface j {
    public static final a a = a.a;

    /* compiled from: ContractDeserializer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final j f21090b = new C0350a();

        /* compiled from: ContractDeserializer.kt */
        /* renamed from: kotlin.f0.x.e.l0.j.b.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0350a implements j {
            C0350a() {
            }

            @Override // kotlin.reflect.x.internal.l0.j.b.j
            public Pair a(i iVar, y yVar, g gVar, d0 d0Var) {
                l.f(iVar, "proto");
                l.f(yVar, "ownerFunction");
                l.f(gVar, "typeTable");
                l.f(d0Var, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final j a() {
            return f21090b;
        }
    }

    Pair<a.InterfaceC0365a<?>, Object> a(i iVar, y yVar, g gVar, d0 d0Var);
}
