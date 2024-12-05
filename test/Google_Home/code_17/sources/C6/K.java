package C6;

import O5.AbstractC1346b;
import O5.AbstractC1347c;
import O5.C1345a;
import O5.C1352h;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1030a f1618a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1619b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1620c;

    /* renamed from: d, reason: collision with root package name */
    private int f1621d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f1622a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f1623b;

        a(S5.d dVar) {
            super(3, dVar);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1347c abstractC1347c, O5.I i8, S5.d dVar) {
            a aVar = new a(dVar);
            aVar.f1623b = abstractC1347c;
            return aVar.invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f1622a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                AbstractC1347c abstractC1347c = (AbstractC1347c) this.f1623b;
                byte F8 = K.this.f1618a.F();
                if (F8 == 1) {
                    return K.this.j(true);
                }
                if (F8 == 0) {
                    return K.this.j(false);
                }
                if (F8 == 6) {
                    K k8 = K.this;
                    this.f1622a = 1;
                    obj = k8.i(abstractC1347c, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (F8 == 8) {
                        return K.this.f();
                    }
                    AbstractC1030a.x(K.this.f1618a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C1352h();
                }
            }
            return (B6.i) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f1625a;

        /* renamed from: b, reason: collision with root package name */
        Object f1626b;

        /* renamed from: c, reason: collision with root package name */
        Object f1627c;

        /* renamed from: d, reason: collision with root package name */
        Object f1628d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f1629e;

        /* renamed from: g, reason: collision with root package name */
        int f1631g;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1629e = obj;
            this.f1631g |= Integer.MIN_VALUE;
            return K.this.i(null, this);
        }
    }

    public K(B6.f configuration, AbstractC1030a lexer) {
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(lexer, "lexer");
        this.f1618a = lexer;
        this.f1619b = configuration.o();
        this.f1620c = configuration.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B6.i f() {
        boolean z8;
        byte j8 = this.f1618a.j();
        if (this.f1618a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f1618a.e()) {
                arrayList.add(e());
                j8 = this.f1618a.j();
                if (j8 != 4) {
                    AbstractC1030a abstractC1030a = this.f1618a;
                    if (j8 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = abstractC1030a.f1665a;
                    if (!z8) {
                        AbstractC1030a.x(abstractC1030a, "Expected end of the array or comma", i8, null, 4, null);
                        throw new C1352h();
                    }
                }
            }
            if (j8 == 8) {
                this.f1618a.k((byte) 9);
            } else if (j8 == 4) {
                if (this.f1620c) {
                    this.f1618a.k((byte) 9);
                } else {
                    B.g(this.f1618a, "array");
                    throw new C1352h();
                }
            }
            return new B6.b(arrayList);
        }
        AbstractC1030a.x(this.f1618a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1352h();
    }

    private final B6.i g() {
        return (B6.i) AbstractC1346b.b(new C1345a(new a(null)), O5.I.f8278a);
    }

    private final B6.i h() {
        String o8;
        byte k8 = this.f1618a.k((byte) 6);
        if (this.f1618a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f1618a.e()) {
                    break;
                }
                if (this.f1619b) {
                    o8 = this.f1618a.q();
                } else {
                    o8 = this.f1618a.o();
                }
                this.f1618a.k((byte) 5);
                linkedHashMap.put(o8, e());
                k8 = this.f1618a.j();
                if (k8 != 4) {
                    if (k8 != 7) {
                        AbstractC1030a.x(this.f1618a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C1352h();
                    }
                }
            }
            if (k8 == 6) {
                this.f1618a.k((byte) 7);
            } else if (k8 == 4) {
                if (this.f1620c) {
                    this.f1618a.k((byte) 7);
                } else {
                    B.h(this.f1618a, null, 1, null);
                    throw new C1352h();
                }
            }
            return new B6.v(linkedHashMap);
        }
        AbstractC1030a.x(this.f1618a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1352h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0096 -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(O5.AbstractC1347c r21, S5.d r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.K.i(O5.c, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B6.x j(boolean z8) {
        String q8;
        if (!this.f1619b && z8) {
            q8 = this.f1618a.o();
        } else {
            q8 = this.f1618a.q();
        }
        String str = q8;
        if (!z8 && AbstractC3255y.d(str, "null")) {
            return B6.t.INSTANCE;
        }
        return new B6.p(str, z8, null, 4, null);
    }

    public final B6.i e() {
        B6.i h8;
        byte F8 = this.f1618a.F();
        if (F8 == 1) {
            return j(true);
        }
        if (F8 == 0) {
            return j(false);
        }
        if (F8 == 6) {
            int i8 = this.f1621d + 1;
            this.f1621d = i8;
            if (i8 == 200) {
                h8 = g();
            } else {
                h8 = h();
            }
            this.f1621d--;
            return h8;
        }
        if (F8 == 8) {
            return f();
        }
        AbstractC1030a.x(this.f1618a, "Cannot read Json element because of unexpected " + AbstractC1031b.c(F8), 0, null, 6, null);
        throw new C1352h();
    }
}
