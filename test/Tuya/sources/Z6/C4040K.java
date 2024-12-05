package z6;

import L5.AbstractC1218b;
import L5.AbstractC1219c;
import L5.C1217a;
import L5.C1224h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC4007i;
import y6.C4000b;
import y6.C4004f;

/* renamed from: z6.K, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4040K {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4041a f40500a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40501b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40502c;

    /* renamed from: d, reason: collision with root package name */
    private int f40503d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.K$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f40504a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40505b;

        a(P5.d dVar) {
            super(3, dVar);
        }

        @Override // X5.o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1219c abstractC1219c, L5.I i8, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f40505b = abstractC1219c;
            return aVar.invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f40504a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                AbstractC1219c abstractC1219c = (AbstractC1219c) this.f40505b;
                byte F8 = C4040K.this.f40500a.F();
                if (F8 == 1) {
                    return C4040K.this.j(true);
                }
                if (F8 == 0) {
                    return C4040K.this.j(false);
                }
                if (F8 == 6) {
                    C4040K c4040k = C4040K.this;
                    this.f40504a = 1;
                    obj = c4040k.h(abstractC1219c, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (F8 == 8) {
                        return C4040K.this.f();
                    }
                    AbstractC4041a.x(C4040K.this.f40500a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C1224h();
                }
            }
            return (AbstractC4007i) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.K$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40507a;

        /* renamed from: b, reason: collision with root package name */
        Object f40508b;

        /* renamed from: c, reason: collision with root package name */
        Object f40509c;

        /* renamed from: d, reason: collision with root package name */
        Object f40510d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40511e;

        /* renamed from: g, reason: collision with root package name */
        int f40513g;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40511e = obj;
            this.f40513g |= Integer.MIN_VALUE;
            return C4040K.this.h(null, this);
        }
    }

    public C4040K(C4004f configuration, AbstractC4041a lexer) {
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(lexer, "lexer");
        this.f40500a = lexer;
        this.f40501b = configuration.o();
        this.f40502c = configuration.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4007i f() {
        boolean z8;
        byte j8 = this.f40500a.j();
        if (this.f40500a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f40500a.e()) {
                arrayList.add(e());
                j8 = this.f40500a.j();
                if (j8 != 4) {
                    AbstractC4041a abstractC4041a = this.f40500a;
                    if (j8 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = abstractC4041a.f40547a;
                    if (!z8) {
                        AbstractC4041a.x(abstractC4041a, "Expected end of the array or comma", i8, null, 4, null);
                        throw new C1224h();
                    }
                }
            }
            if (j8 == 8) {
                this.f40500a.k((byte) 9);
            } else if (j8 == 4) {
                if (this.f40502c) {
                    this.f40500a.k((byte) 9);
                } else {
                    AbstractC4031B.g(this.f40500a, "array");
                    throw new C1224h();
                }
            }
            return new C4000b(arrayList);
        }
        AbstractC4041a.x(this.f40500a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1224h();
    }

    private final AbstractC4007i g() {
        return (AbstractC4007i) AbstractC1218b.b(new C1217a(new a(null)), L5.I.f6487a);
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
    public final java.lang.Object h(L5.AbstractC1219c r21, P5.d r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.C4040K.h(L5.c, P5.d):java.lang.Object");
    }

    private final AbstractC4007i i() {
        String o8;
        byte k8 = this.f40500a.k((byte) 6);
        if (this.f40500a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f40500a.e()) {
                    break;
                }
                if (this.f40501b) {
                    o8 = this.f40500a.q();
                } else {
                    o8 = this.f40500a.o();
                }
                this.f40500a.k((byte) 5);
                linkedHashMap.put(o8, e());
                k8 = this.f40500a.j();
                if (k8 != 4) {
                    if (k8 != 7) {
                        AbstractC4041a.x(this.f40500a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C1224h();
                    }
                }
            }
            if (k8 == 6) {
                this.f40500a.k((byte) 7);
            } else if (k8 == 4) {
                if (this.f40502c) {
                    this.f40500a.k((byte) 7);
                } else {
                    AbstractC4031B.h(this.f40500a, null, 1, null);
                    throw new C1224h();
                }
            }
            return new y6.v(linkedHashMap);
        }
        AbstractC4041a.x(this.f40500a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1224h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y6.x j(boolean z8) {
        String q8;
        if (!this.f40501b && z8) {
            q8 = this.f40500a.o();
        } else {
            q8 = this.f40500a.q();
        }
        String str = q8;
        if (!z8 && AbstractC3159y.d(str, "null")) {
            return y6.t.INSTANCE;
        }
        return new y6.p(str, z8, null, 4, null);
    }

    public final AbstractC4007i e() {
        AbstractC4007i i8;
        byte F8 = this.f40500a.F();
        if (F8 == 1) {
            return j(true);
        }
        if (F8 == 0) {
            return j(false);
        }
        if (F8 == 6) {
            int i9 = this.f40503d + 1;
            this.f40503d = i9;
            if (i9 == 200) {
                i8 = g();
            } else {
                i8 = i();
            }
            this.f40503d--;
            return i8;
        }
        if (F8 == 8) {
            return f();
        }
        AbstractC4041a.x(this.f40500a, "Cannot read Json element because of unexpected " + AbstractC4042b.c(F8), 0, null, 6, null);
        throw new C1224h();
    }
}
