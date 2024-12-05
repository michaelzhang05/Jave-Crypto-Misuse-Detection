package p6;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import l6.N;
import l6.O;
import l6.Q;
import n6.EnumC3487a;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public abstract class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final S5.g f37902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37903b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3487a f37904c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37905a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37906b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f37907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f37908d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3707g interfaceC3707g, e eVar, S5.d dVar) {
            super(2, dVar);
            this.f37907c = interfaceC3707g;
            this.f37908d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f37907c, this.f37908d, dVar);
            aVar.f37906b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f37905a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                M m8 = (M) this.f37906b;
                InterfaceC3707g interfaceC3707g = this.f37907c;
                n6.u m9 = this.f37908d.m(m8);
                this.f37905a = 1;
                if (AbstractC3708h.s(interfaceC3707g, m9, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f37909a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37910b;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(dVar);
            bVar.f37910b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f37909a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                n6.s sVar = (n6.s) this.f37910b;
                e eVar = e.this;
                this.f37909a = 1;
                if (eVar.h(sVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(n6.s sVar, S5.d dVar) {
            return ((b) create(sVar, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public e(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        this.f37902a = gVar;
        this.f37903b = i8;
        this.f37904c = enumC3487a;
    }

    static /* synthetic */ Object g(e eVar, InterfaceC3707g interfaceC3707g, S5.d dVar) {
        Object e8 = N.e(new a(interfaceC3707g, eVar, null), dVar);
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // p6.p
    public InterfaceC3706f a(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        S5.g plus = gVar.plus(this.f37902a);
        if (enumC3487a == EnumC3487a.SUSPEND) {
            int i9 = this.f37903b;
            if (i9 != -3) {
                if (i8 != -3) {
                    if (i9 != -2) {
                        if (i8 != -2) {
                            i8 += i9;
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i8 = i9;
            }
            enumC3487a = this.f37904c;
        }
        if (AbstractC3255y.d(plus, this.f37902a) && i8 == this.f37903b && enumC3487a == this.f37904c) {
            return this;
        }
        return i(plus, i8, enumC3487a);
    }

    protected String b() {
        return null;
    }

    @Override // o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        return g(this, interfaceC3707g, dVar);
    }

    protected abstract Object h(n6.s sVar, S5.d dVar);

    protected abstract e i(S5.g gVar, int i8, EnumC3487a enumC3487a);

    public InterfaceC3706f j() {
        return null;
    }

    public final InterfaceC1668n k() {
        return new b(null);
    }

    public final int l() {
        int i8 = this.f37903b;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public n6.u m(M m8) {
        return n6.q.c(m8, this.f37902a, l(), this.f37904c, O.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b8 = b();
        if (b8 != null) {
            arrayList.add(b8);
        }
        if (this.f37902a != S5.h.f9825a) {
            arrayList.add("context=" + this.f37902a);
        }
        if (this.f37903b != -3) {
            arrayList.add("capacity=" + this.f37903b);
        }
        if (this.f37904c != EnumC3487a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f37904c);
        }
        return Q.a(this) + '[' + AbstractC1378t.w0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
