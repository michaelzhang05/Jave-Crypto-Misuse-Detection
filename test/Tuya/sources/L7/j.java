package L7;

import L5.I;
import c.C1895i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f6732a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f6733b;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f6734a;

        public a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new a((P5.d) obj2).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6734a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                H7.m mVar = H7.m.f3657a;
                this.f6734a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f6735a;

        public b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new b((P5.d) obj2).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6735a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                H7.m mVar = H7.m.f3657a;
                this.f6735a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public j(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        this.f6732a = sharedStorage;
        this.f6733b = choiceCmpCallback;
    }

    @Override // L7.i
    public void a() {
        C1895i c1895i = C1895i.f14839a;
        if (C1895i.f14840b) {
            C1895i.f14841c.setAllOwnedItems();
            SharedStorage sharedStorage = this.f6732a;
            N7.a aVar = N7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14841c));
            ChoiceCmpCallback choiceCmpCallback = this.f6733b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
            }
            AbstractC2829k.d(C2842q0.f31799a, C2812b0.b(), null, new a(null), 2, null);
        }
    }

    @Override // L7.i
    public void b() {
        C1895i c1895i = C1895i.f14839a;
        if (C1895i.f14840b) {
            C1895i.f14841c.unsetAllOwnedItems();
            SharedStorage sharedStorage = this.f6732a;
            N7.a aVar = N7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c1895i.a(sharedStorage.k(aVar), C1895i.f14841c));
            ChoiceCmpCallback choiceCmpCallback = this.f6733b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c1895i.b());
            }
            AbstractC2829k.d(C2842q0.f31799a, C2812b0.b(), null, new b(null), 2, null);
        }
    }
}
