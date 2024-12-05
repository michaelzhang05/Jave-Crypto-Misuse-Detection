package O7;

import O5.I;
import a6.InterfaceC1668n;
import c.C2001i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.C3377q0;

/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f8523a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f8524b;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f8525a;

        public a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new a((S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f8525a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                K7.m mVar = K7.m.f5260a;
                this.f8525a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f8526a;

        public b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new b((S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f8526a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                K7.m mVar = K7.m.f5260a;
                this.f8526a = 1;
                if (mVar.d(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    public j(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        this.f8523a = sharedStorage;
        this.f8524b = choiceCmpCallback;
    }

    @Override // O7.i
    public void a() {
        C2001i c2001i = C2001i.f15551a;
        if (C2001i.f15552b) {
            C2001i.f15553c.setAllOwnedItems();
            SharedStorage sharedStorage = this.f8523a;
            Q7.a aVar = Q7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15553c));
            ChoiceCmpCallback choiceCmpCallback = this.f8524b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
            }
            AbstractC3364k.d(C3377q0.f34651a, C3347b0.b(), null, new a(null), 2, null);
        }
    }

    @Override // O7.i
    public void b() {
        C2001i c2001i = C2001i.f15551a;
        if (C2001i.f15552b) {
            C2001i.f15553c.unsetAllOwnedItems();
            SharedStorage sharedStorage = this.f8523a;
            Q7.a aVar = Q7.a.GBC_CONSENT_STRING;
            sharedStorage.d(aVar, c2001i.a(sharedStorage.k(aVar), C2001i.f15553c));
            ChoiceCmpCallback choiceCmpCallback = this.f8524b;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onGoogleBasicConsentChange(c2001i.b());
            }
            AbstractC3364k.d(C3377q0.f34651a, C3347b0.b(), null, new b(null), 2, null);
        }
    }
}
