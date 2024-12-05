package b4;

import androidx.compose.runtime.ComposerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f15446c = new f("InvalidMessageReceived", 0, 101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes");

    /* renamed from: d, reason: collision with root package name */
    public static final f f15447d = new f("UnsupportedMessageVersion", 1, 102, "Message Version Number received is not valid for the receiving component.");

    /* renamed from: e, reason: collision with root package name */
    public static final f f15448e = new f("RequiredDataElementMissing", 2, ComposerKt.providerKey, "A message element required as defined in Table A.1 is missing from the message.");

    /* renamed from: f, reason: collision with root package name */
    public static final f f15449f = new f("UnrecognizedCriticalMessageExtensions", 3, ComposerKt.compositionLocalMapKey, "Critical message extension not recognised.");

    /* renamed from: g, reason: collision with root package name */
    public static final f f15450g = new f("InvalidDataElementFormat", 4, ComposerKt.providerValuesKey, "Data element not in the required format or value is invalid as defined in Table A.1");

    /* renamed from: h, reason: collision with root package name */
    public static final f f15451h = new f("InvalidTransactionId", 5, 301, "Transaction ID received is not valid for the receiving component.");

    /* renamed from: i, reason: collision with root package name */
    public static final f f15452i = new f("DataDecryptionFailure", 6, 302, "Data could not be decrypted by the receiving system due to technical or other reason.");

    /* renamed from: j, reason: collision with root package name */
    public static final f f15453j = new f("TransactionTimedout", 7, 402, "Transaction timed-out.");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ f[] f15454k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ U5.a f15455l;

    /* renamed from: a, reason: collision with root package name */
    private final int f15456a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15457b;

    static {
        f[] a8 = a();
        f15454k = a8;
        f15455l = U5.b.a(a8);
    }

    private f(String str, int i8, int i9, String str2) {
        this.f15456a = i9;
        this.f15457b = str2;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f15446c, f15447d, f15448e, f15449f, f15450g, f15451h, f15452i, f15453j};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f15454k.clone();
    }

    public final int b() {
        return this.f15456a;
    }

    public final String c() {
        return this.f15457b;
    }
}
