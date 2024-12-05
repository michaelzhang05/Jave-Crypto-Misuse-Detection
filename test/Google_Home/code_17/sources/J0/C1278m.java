package J0;

import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: J0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1278m {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f4693d = new FilenameFilter() { // from class: J0.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d8;
            d8 = C1278m.d(file, str);
            return d8;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f4694e = new Comparator() { // from class: J0.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e8;
            e8 = C1278m.e((File) obj, (File) obj2);
            return e8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final O0.g f4695a;

    /* renamed from: b, reason: collision with root package name */
    private String f4696b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f4697c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1278m(O0.g gVar) {
        this.f4695a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(O0.g gVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                gVar.q(str, "aqs." + str2).createNewFile();
            } catch (IOException e8) {
                G0.h.f().l("Failed to persist App Quality Sessions session id.", e8);
            }
        }
    }

    static String g(O0.g gVar, String str) {
        List r8 = gVar.r(str, f4693d);
        if (r8.isEmpty()) {
            G0.h.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(r8, f4694e)).getName().substring(4);
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f4696b, str)) {
            return this.f4697c;
        }
        return g(this.f4695a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f4697c, str)) {
            f(this.f4695a, this.f4696b, str);
            this.f4697c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f4696b, str)) {
            f(this.f4695a, str, this.f4697c);
            this.f4696b = str;
        }
    }
}
