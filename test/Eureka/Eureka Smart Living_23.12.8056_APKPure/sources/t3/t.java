package t3;

import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.w0;
import com.google.crypto.tink.shaded.protobuf.x;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class t extends com.google.crypto.tink.shaded.protobuf.x implements p0 {
    private static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile w0 PARSER;
    private com.google.crypto.tink.shaded.protobuf.h encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.h.f5485b;
    private d0 keysetInfo_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9338a;

        static {
            int[] iArr = new int[x.d.values().length];
            f9338a = iArr;
            try {
                iArr[x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9338a[x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9338a[x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9338a[x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9338a[x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9338a[x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9338a[x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a implements p0 {
        private b() {
            super(t.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0
        public /* bridge */ /* synthetic */ o0 e() {
            return super.n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.a
        public /* bridge */ /* synthetic */ o0 g() {
            return super.j();
        }

        public b r(com.google.crypto.tink.shaded.protobuf.h hVar) {
            l();
            ((t) this.f5694b).a0(hVar);
            return this;
        }

        public b s(d0 d0Var) {
            l();
            ((t) this.f5694b).b0(d0Var);
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        com.google.crypto.tink.shaded.protobuf.x.Q(t.class, tVar);
    }

    private t() {
    }

    public static b Y() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static t Z(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (t) com.google.crypto.tink.shaded.protobuf.x.L(DEFAULT_INSTANCE, inputStream, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.encryptedKeyset_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(d0 d0Var) {
        d0Var.getClass();
        this.keysetInfo_ = d0Var;
    }

    public com.google.crypto.tink.shaded.protobuf.h X() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public /* bridge */ /* synthetic */ o0.a d() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public /* bridge */ /* synthetic */ o0 e() {
        return super.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    protected final Object t(x.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f9338a[dVar.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                w0 w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (t.class) {
                        w0Var = PARSER;
                        if (w0Var == null) {
                            w0Var = new x.b(DEFAULT_INSTANCE);
                            PARSER = w0Var;
                        }
                    }
                }
                return w0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}