package okhttp3.internal.publicsuffix;

import j.h;
import j.n;
import j.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.io.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.sequences.Sequence;
import kotlin.text.v;
import kotlin.u;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\fJ\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "domain", HttpUrl.FRAGMENT_ENCODE_SET, "splitDomain", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "findMatchingRule", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/u;", "readTheListUninterruptibly", "()V", "readTheList", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "publicSuffixListBytes", "publicSuffixExceptionListBytes", "setListBytes", "([B[B)V", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "[B", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final PublicSuffixDatabase instance;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: PublicSuffixDatabase.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "labels", HttpUrl.FRAGMENT_ENCODE_SET, "labelIndex", HttpUrl.FRAGMENT_ENCODE_SET, "binarySearch", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "EXCEPTION_MARKER", "C", HttpUrl.FRAGMENT_ENCODE_SET, "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = Util.and(bArr2[i9][i10], 255);
                    }
                    and2 = and - Util.and(bArr[i6 + i11], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                l.e(charset, "UTF_8");
                                return new String(bArr, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        List<String> e2;
        e2 = s.e("*");
        PREVAILING_RULE = e2;
        instance = new PublicSuffixDatabase();
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            l.v("publicSuffixListBytes");
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        r4 = kotlin.text.v.o0(r8, new char[]{'.'}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        r1 = kotlin.text.v.o0(r5, new char[]{'.'}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.findMatchingRule(java.util.List):java.util.List");
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        h d2 = q.d(new n(q.k(resourceAsStream)));
        try {
            byte[] d0 = d2.d0(d2.readInt());
            byte[] d02 = d2.d0(d2.readInt());
            u uVar = u.a;
            a.a(d2, null);
            synchronized (this) {
                l.c(d0);
                this.publicSuffixListBytes = d0;
                l.c(d02);
                this.publicSuffixExceptionListBytes = d02;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String domain) {
        List<String> o0;
        List<String> M;
        o0 = v.o0(domain, new char[]{'.'}, false, 0, 6, null);
        if (!l.a((String) r.d0(o0), HttpUrl.FRAGMENT_ENCODE_SET)) {
            return o0;
        }
        M = b0.M(o0, 1);
        return M;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        Sequence I;
        Sequence k2;
        String s;
        l.f(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        l.e(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        I = b0.I(splitDomain(domain));
        k2 = kotlin.sequences.n.k(I, size - size2);
        s = kotlin.sequences.n.s(k2, ".", null, null, 0, null, null, 62, null);
        return s;
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        l.f(publicSuffixListBytes, "publicSuffixListBytes");
        l.f(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
