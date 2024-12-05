package i4;

import O5.s;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3255y;
import n3.i;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2986a implements InterfaceC2987b {

    /* renamed from: b, reason: collision with root package name */
    private final PlacesClient f32960b;

    /* renamed from: c, reason: collision with root package name */
    private final i f32961c;

    /* renamed from: d, reason: collision with root package name */
    private final AutocompleteSessionToken f32962d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0768a extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f32963a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32964b;

        /* renamed from: d, reason: collision with root package name */
        int f32966d;

        C0768a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32964b = obj;
            this.f32966d |= Integer.MIN_VALUE;
            Object a8 = C2986a.this.a(null, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i4.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f32967a;

        /* renamed from: b, reason: collision with root package name */
        int f32968b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32969c;

        /* renamed from: e, reason: collision with root package name */
        int f32971e;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32969c = obj;
            this.f32971e |= Integer.MIN_VALUE;
            Object b8 = C2986a.this.b(null, null, 0, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    public C2986a(PlacesClient client, i errorReporter) {
        AbstractC3255y.i(client, "client");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f32960b = client;
        this.f32961c = errorReporter;
        this.f32962d = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // i4.InterfaceC2987b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, S5.d r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C2986a.a(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[Catch: Exception -> 0x002f, LOOP:0: B:13:0x009b->B:15:0x00a1, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x0072, B:13:0x009b, B:15:0x00a1, B:17:0x00d5), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // i4.InterfaceC2987b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r11, java.lang.String r12, int r13, S5.d r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C2986a.b(java.lang.String, java.lang.String, int, S5.d):java.lang.Object");
    }
}
