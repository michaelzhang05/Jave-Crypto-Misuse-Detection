package H7;

import L5.I;
import L5.t;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c.C1894h;
import c.C1895i;
import c.C1896j;
import c.C1897k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.C2842q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3657a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static UUID f3658b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public static g f3659c = O7.d.f7806a.o();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3660a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[1] = 1;
            iArr[5] = 2;
            iArr[0] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            f3660a = iArr;
            int[] iArr2 = new int[n.values().length];
            iArr2[5] = 1;
            iArr2[6] = 2;
            iArr2[4] = 3;
            int[] iArr3 = new int[H7.a.values().length];
            iArr3[0] = 1;
            iArr3[2] = 2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3661a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3662b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3663c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f3664d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Boolean f3665e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f3666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Boolean bool, f fVar, P5.d dVar) {
            super(2, dVar);
            this.f3663c = str;
            this.f3664d = str2;
            this.f3665e = bool;
            this.f3666f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(this.f3663c, this.f3664d, this.f3665e, this.f3666f, dVar);
            bVar.f3662b = obj;
            return bVar;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return ((b) create((LiveDataScope) obj, (P5.d) obj2)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            String str2;
            Object e8 = Q5.b.e();
            int i8 = this.f3661a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f3662b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f3662b;
                g gVar = m.f3659c;
                String str3 = this.f3663c;
                if (str3 != null && str3.length() != 0) {
                    str = this.f3663c;
                } else {
                    str = null;
                }
                String j8 = O7.d.f7806a.m().j(N7.a.NON_IAB_CONSENT_ENCODED);
                String str4 = this.f3664d;
                if (str4.length() == 0) {
                    str2 = null;
                } else {
                    str2 = str4;
                }
                Boolean bool = this.f3665e;
                f fVar = this.f3666f;
                this.f3662b = liveDataScope;
                this.f3661a = 1;
                obj = g.c(gVar, bool, str, str2, j8, null, fVar, this, 16);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f3662b = null;
            this.f3661a = 2;
            if (liveDataScope.emit((String) obj, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3667a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3668b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3669c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ H7.a f3670d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f3671e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, H7.a aVar, int i8, P5.d dVar) {
            super(2, dVar);
            this.f3669c = str;
            this.f3670d = aVar;
            this.f3671e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(this.f3669c, this.f3670d, this.f3671e, dVar);
            cVar.f3668b = obj;
            return cVar;
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            c cVar = new c(this.f3669c, this.f3670d, this.f3671e, (P5.d) obj2);
            cVar.f3668b = (LiveDataScope) obj;
            return cVar.invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f3667a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f3668b;
                t.b(obj);
                a8 = obj;
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f3668b;
                g gVar = m.f3659c;
                String j8 = O7.d.f7806a.m().j(N7.a.GPP_STRING);
                if (AbstractC3159y.d(this.f3669c, "STATE_AND_NATIONAL")) {
                    str = O7.d.f7819n;
                } else {
                    str = null;
                }
                String str2 = this.f3669c;
                H7.a aVar = this.f3670d;
                int i9 = this.f3671e;
                this.f3668b = liveDataScope;
                this.f3667a = 1;
                gVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(gVar.f3627g);
                j jVar = new j(arrayList, aVar.f3594a, H7.d.a(i9), null, j8, str, str2, null, null, 392);
                gVar.f3627g.clear();
                a8 = gVar.a(e.DONE, jVar, f.MSPA, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            this.f3668b = null;
            this.f3667a = 2;
            if (liveDataScope.emit((String) a8, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public int f3672a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f3673b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f3674c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t8, T t9, P5.d dVar) {
            super(2, dVar);
            this.f3673b = t8;
            this.f3674c = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f3673b, this.f3674c, dVar);
        }

        @Override // X5.n
        public Object invoke(Object obj, Object obj2) {
            return new d(this.f3673b, this.f3674c, (P5.d) obj2).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f3672a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g gVar = m.f3659c;
                f fVar = (f) this.f3673b.f33761a;
                H7.c cVar = (H7.c) this.f3674c.f33761a;
                this.f3672a = 1;
                if (gVar.b(fVar, cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    static {
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public final LiveData a(n actionTag, H7.a acceptanceState) {
        String valueOf;
        int i8;
        AbstractC3159y.i(actionTag, "actionTag");
        AbstractC3159y.i(acceptanceState, "acceptanceState");
        int ordinal = actionTag.ordinal();
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
        }
        int ordinal2 = acceptanceState.ordinal();
        if (ordinal2 != 0) {
            i8 = 2;
            if (ordinal2 != 2) {
                i8 = 3;
            }
        } else {
            i8 = 1;
        }
        f3659c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((P5.g) null, 0L, new c(O7.d.f7806a.m().j(N7.a.SAVED_MSPA_JURISDICTION), acceptanceState, i8, null), 3, (Object) null);
    }

    public final LiveData b(n actionTag, f regulation) {
        String valueOf;
        Boolean bool;
        Boolean bool2;
        AbstractC3159y.i(actionTag, "actionTag");
        AbstractC3159y.i(regulation, "regulation");
        int ordinal = actionTag.ordinal();
        String str = null;
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 6) {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.PARTIAL_CONSENT);
                } else {
                    bool2 = Boolean.FALSE;
                    valueOf = String.valueOf(n.REJECT_ALL);
                }
            } else {
                bool2 = Boolean.TRUE;
                valueOf = String.valueOf(n.ACCEPT_ALL);
            }
            bool = bool2;
        } else {
            valueOf = String.valueOf(n.SAVE_AND_EXIT);
            bool = null;
        }
        if (a.f3660a[regulation.ordinal()] == 1) {
            str = O7.d.f7806a.m().j(N7.a.TC_STRING);
        }
        String str2 = str;
        String j8 = O7.d.f7806a.m().j(N7.a.GPP_STRING);
        f3659c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((P5.g) null, 0L, new b(str2, j8, bool, regulation, null), 3, (Object) null);
    }

    public final Object c(f fVar, int i8, P5.d dVar) {
        Object a8;
        f3659c.e("goToPage", String.valueOf(i8));
        g gVar = f3659c;
        if (gVar.f3627g.size() < 2) {
            a8 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(gVar.f3627g);
            k kVar = new k(arrayList);
            gVar.f3627g.clear();
            a8 = gVar.a(e.NAVIGATION, kVar, fVar, dVar);
        }
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    public final Object d(P5.d dVar) {
        String str;
        g gVar = f3659c;
        f fVar = f.GBC;
        C1895i c1895i = C1895i.f14839a;
        ArrayList arrayList = new ArrayList();
        C1895i.f14841c.forEach(new C1894h(arrayList));
        gVar.getClass();
        O o8 = new O();
        o8.f33757a = true;
        C1895i.f14841c.forEach(new C1896j(o8));
        if (o8.f33757a) {
            str = "All";
        } else {
            O o9 = new O();
            o9.f33757a = true;
            C1895i.f14841c.forEach(new C1897k(o9));
            if (o9.f33757a) {
                str = "Reject";
            } else {
                str = "Partial";
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(gVar.f3627g);
        l lVar = new l(arrayList2, str, arrayList);
        gVar.f3627g.clear();
        Object a8 = gVar.a(e.DONE, lVar, fVar, dVar);
        if (a8 == Q5.b.e()) {
            return a8;
        }
        return I.f6487a;
    }

    public final void e(f regulation, boolean z8) {
        H7.c cVar;
        H7.c cVar2;
        AbstractC3159y.i(regulation, "regulation");
        T t8 = new T();
        t8.f33761a = regulation;
        T t9 = new T();
        H7.c cVar3 = H7.c.TCF_CHANGE_OF_CONSENT;
        t9.f33761a = cVar3;
        int ordinal = regulation.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (z8) {
                                    cVar2 = H7.c.MSPA_MANDATORY;
                                } else if (O7.d.f7806a.m().h(N7.a.MSPA_SHOWN)) {
                                    cVar2 = H7.c.MSPA_CHANGE_OF_CONSENT;
                                } else {
                                    cVar2 = H7.c.MSPA_OPT_OUT;
                                }
                                t9.f33761a = cVar2;
                            }
                        } else {
                            t9.f33761a = H7.c.GBC_US_OPT_OUT;
                        }
                    } else {
                        if (z8) {
                            cVar = H7.c.GBC_MANDATORY;
                        } else {
                            cVar = H7.c.GBC_CHANGE_OF_CONSENT;
                        }
                        t9.f33761a = cVar;
                    }
                } else {
                    t9.f33761a = H7.c.GBC;
                }
            } else {
                if (z8) {
                    cVar3 = H7.c.TCF_MANDATORY;
                }
                t9.f33761a = cVar3;
            }
        } else {
            t9.f33761a = H7.c.USP;
        }
        if (regulation == f.GDPRWITHGBC || regulation == f.USPWITHGBC) {
            t8.f33761a = f.GBC;
        }
        f3659c.e("startOnPage", t8.f33761a + "_1");
        f3658b = UUID.randomUUID();
        AbstractC2829k.d(C2842q0.f31799a, C2812b0.b(), null, new d(t8, t9, null), 2, null);
    }

    public final void f(String identifier, String value) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(value, "value");
        f3659c.e(identifier, value);
    }
}
