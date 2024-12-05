package K7;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c.C2000h;
import c.C2001i;
import c.C2002j;
import c.C2003k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.C3377q0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5260a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static UUID f5261b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public static g f5262c = R7.d.f9662a.o();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5263a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[1] = 1;
            iArr[5] = 2;
            iArr[0] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            f5263a = iArr;
            int[] iArr2 = new int[n.values().length];
            iArr2[5] = 1;
            iArr2[6] = 2;
            iArr2[4] = 3;
            int[] iArr3 = new int[K7.a.values().length];
            iArr3[0] = 1;
            iArr3[2] = 2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f5264a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f5266c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f5267d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Boolean f5268e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f5269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Boolean bool, f fVar, S5.d dVar) {
            super(2, dVar);
            this.f5266c = str;
            this.f5267d = str2;
            this.f5268e = bool;
            this.f5269f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(this.f5266c, this.f5267d, this.f5268e, this.f5269f, dVar);
            bVar.f5265b = obj;
            return bVar;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return ((b) create((LiveDataScope) obj, (S5.d) obj2)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            String str2;
            Object e8 = T5.b.e();
            int i8 = this.f5264a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f5265b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f5265b;
                g gVar = m.f5262c;
                String str3 = this.f5266c;
                if (str3 != null && str3.length() != 0) {
                    str = this.f5266c;
                } else {
                    str = null;
                }
                String j8 = R7.d.f9662a.m().j(Q7.a.NON_IAB_CONSENT_ENCODED);
                String str4 = this.f5267d;
                if (str4.length() == 0) {
                    str2 = null;
                } else {
                    str2 = str4;
                }
                Boolean bool = this.f5268e;
                f fVar = this.f5269f;
                this.f5265b = liveDataScope;
                this.f5264a = 1;
                obj = g.c(gVar, bool, str, str2, j8, null, fVar, this, 16);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f5265b = null;
            this.f5264a = 2;
            if (liveDataScope.emit((String) obj, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f5270a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f5272c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ K7.a f5273d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f5274e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, K7.a aVar, int i8, S5.d dVar) {
            super(2, dVar);
            this.f5272c = str;
            this.f5273d = aVar;
            this.f5274e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            c cVar = new c(this.f5272c, this.f5273d, this.f5274e, dVar);
            cVar.f5271b = obj;
            return cVar;
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            c cVar = new c(this.f5272c, this.f5273d, this.f5274e, (S5.d) obj2);
            cVar.f5271b = (LiveDataScope) obj;
            return cVar.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f5270a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f5271b;
                t.b(obj);
                a8 = obj;
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f5271b;
                g gVar = m.f5262c;
                String j8 = R7.d.f9662a.m().j(Q7.a.GPP_STRING);
                if (AbstractC3255y.d(this.f5272c, "STATE_AND_NATIONAL")) {
                    str = R7.d.f9675n;
                } else {
                    str = null;
                }
                String str2 = this.f5272c;
                K7.a aVar = this.f5273d;
                int i9 = this.f5274e;
                this.f5271b = liveDataScope;
                this.f5270a = 1;
                gVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(gVar.f5230g);
                j jVar = new j(arrayList, aVar.f5197a, K7.d.a(i9), null, j8, str, str2, null, null, 392);
                gVar.f5230g.clear();
                a8 = gVar.a(e.DONE, jVar, f.MSPA, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            this.f5271b = null;
            this.f5270a = 2;
            if (liveDataScope.emit((String) a8, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public int f5275a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f5276b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f5277c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t8, T t9, S5.d dVar) {
            super(2, dVar);
            this.f5276b = t8;
            this.f5277c = t9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f5276b, this.f5277c, dVar);
        }

        @Override // a6.InterfaceC1668n
        public Object invoke(Object obj, Object obj2) {
            return new d(this.f5276b, this.f5277c, (S5.d) obj2).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f5275a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                g gVar = m.f5262c;
                f fVar = (f) this.f5276b.f34162a;
                K7.c cVar = (K7.c) this.f5277c.f34162a;
                this.f5275a = 1;
                if (gVar.b(fVar, cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    static {
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public final LiveData a(n actionTag, K7.a acceptanceState) {
        String valueOf;
        int i8;
        AbstractC3255y.i(actionTag, "actionTag");
        AbstractC3255y.i(acceptanceState, "acceptanceState");
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
        f5262c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((S5.g) null, 0L, new c(R7.d.f9662a.m().j(Q7.a.SAVED_MSPA_JURISDICTION), acceptanceState, i8, null), 3, (Object) null);
    }

    public final LiveData b(n actionTag, f regulation) {
        String valueOf;
        Boolean bool;
        Boolean bool2;
        AbstractC3255y.i(actionTag, "actionTag");
        AbstractC3255y.i(regulation, "regulation");
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
        if (a.f5263a[regulation.ordinal()] == 1) {
            str = R7.d.f9662a.m().j(Q7.a.TC_STRING);
        }
        String str2 = str;
        String j8 = R7.d.f9662a.m().j(Q7.a.GPP_STRING);
        f5262c.e(valueOf, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        return CoroutineLiveDataKt.liveData$default((S5.g) null, 0L, new b(str2, j8, bool, regulation, null), 3, (Object) null);
    }

    public final Object c(f fVar, int i8, S5.d dVar) {
        Object a8;
        f5262c.e("goToPage", String.valueOf(i8));
        g gVar = f5262c;
        if (gVar.f5230g.size() < 2) {
            a8 = "";
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(gVar.f5230g);
            k kVar = new k(arrayList);
            gVar.f5230g.clear();
            a8 = gVar.a(e.NAVIGATION, kVar, fVar, dVar);
        }
        if (a8 == T5.b.e()) {
            return a8;
        }
        return I.f8278a;
    }

    public final Object d(S5.d dVar) {
        String str;
        g gVar = f5262c;
        f fVar = f.GBC;
        C2001i c2001i = C2001i.f15551a;
        ArrayList arrayList = new ArrayList();
        C2001i.f15553c.forEach(new C2000h(arrayList));
        gVar.getClass();
        O o8 = new O();
        o8.f34158a = true;
        C2001i.f15553c.forEach(new C2002j(o8));
        if (o8.f34158a) {
            str = "All";
        } else {
            O o9 = new O();
            o9.f34158a = true;
            C2001i.f15553c.forEach(new C2003k(o9));
            if (o9.f34158a) {
                str = "Reject";
            } else {
                str = "Partial";
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(gVar.f5230g);
        l lVar = new l(arrayList2, str, arrayList);
        gVar.f5230g.clear();
        Object a8 = gVar.a(e.DONE, lVar, fVar, dVar);
        if (a8 == T5.b.e()) {
            return a8;
        }
        return I.f8278a;
    }

    public final void e(f regulation, boolean z8) {
        K7.c cVar;
        K7.c cVar2;
        AbstractC3255y.i(regulation, "regulation");
        T t8 = new T();
        t8.f34162a = regulation;
        T t9 = new T();
        K7.c cVar3 = K7.c.TCF_CHANGE_OF_CONSENT;
        t9.f34162a = cVar3;
        int ordinal = regulation.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (z8) {
                                    cVar2 = K7.c.MSPA_MANDATORY;
                                } else if (R7.d.f9662a.m().h(Q7.a.MSPA_SHOWN)) {
                                    cVar2 = K7.c.MSPA_CHANGE_OF_CONSENT;
                                } else {
                                    cVar2 = K7.c.MSPA_OPT_OUT;
                                }
                                t9.f34162a = cVar2;
                            }
                        } else {
                            t9.f34162a = K7.c.GBC_US_OPT_OUT;
                        }
                    } else {
                        if (z8) {
                            cVar = K7.c.GBC_MANDATORY;
                        } else {
                            cVar = K7.c.GBC_CHANGE_OF_CONSENT;
                        }
                        t9.f34162a = cVar;
                    }
                } else {
                    t9.f34162a = K7.c.GBC;
                }
            } else {
                if (z8) {
                    cVar3 = K7.c.TCF_MANDATORY;
                }
                t9.f34162a = cVar3;
            }
        } else {
            t9.f34162a = K7.c.USP;
        }
        if (regulation == f.GDPRWITHGBC || regulation == f.USPWITHGBC) {
            t8.f34162a = f.GBC;
        }
        f5262c.e("startOnPage", t8.f34162a + "_1");
        f5261b = UUID.randomUUID();
        AbstractC3364k.d(C3377q0.f34651a, C3347b0.b(), null, new d(t8, t9, null), 2, null);
    }

    public final void f(String identifier, String value) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(value, "value");
        f5262c.e(identifier, value);
    }
}
