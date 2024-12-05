package M0;

import H0.AbstractC1184s;
import H0.C1177k;
import J0.B;
import K0.h;
import O0.i;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f6850e = Charset.forName(C.UTF8_NAME);

    /* renamed from: f, reason: collision with root package name */
    private static final int f6851f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final h f6852g = new h();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f6853h = new Comparator() { // from class: M0.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u8;
            u8 = e.u((File) obj, (File) obj2);
            return u8;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f6854i = new FilenameFilter() { // from class: M0.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v8;
            v8 = e.v(file, str);
            return v8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f6855a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final f f6856b;

    /* renamed from: c, reason: collision with root package name */
    private final i f6857c;

    /* renamed from: d, reason: collision with root package name */
    private final C1177k f6858d;

    public e(f fVar, i iVar, C1177k c1177k) {
        this.f6856b = fVar;
        this.f6857c = iVar;
        this.f6858d = c1177k;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f6850e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, B.d dVar, String str, B.a aVar) {
        try {
            h hVar = f6852g;
            G(this.f6856b.g(str), hVar.G(hVar.F(A(file)).r(dVar).o(aVar)));
        } catch (IOException e8) {
            E0.f.f().l("Could not synthesize final native report file for " + file, e8);
        }
    }

    private void C(String str, long j8) {
        boolean z8;
        List<File> p8 = this.f6856b.p(str, f6854i);
        if (p8.isEmpty()) {
            E0.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p8);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z8 = false;
            for (File file : p8) {
                try {
                    arrayList.add(f6852g.h(A(file)));
                } catch (IOException e8) {
                    E0.f.f().l("Could not add event to report for " + file, e8);
                }
                if (z8 || s(file.getName())) {
                    z8 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            E0.f.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f6856b.o(str, "report"), arrayList, j8, z8, I0.h.g(str, this.f6856b), F(this.f6856b.o(str, "app-quality-session-id")));
    }

    private void D(File file, List list, long j8, boolean z8, String str, String str2) {
        File l8;
        try {
            h hVar = f6852g;
            B p8 = hVar.F(A(file)).s(j8, z8, str).n(str2).p(J0.C.a(list));
            B.e l9 = p8.l();
            if (l9 == null) {
                return;
            }
            E0.f.f().b("appQualitySessionId: " + str2);
            if (z8) {
                l8 = this.f6856b.j(l9.i());
            } else {
                l8 = this.f6856b.l(l9.i());
            }
            G(l8, hVar.G(p8));
        } catch (IOException e8) {
            E0.f.f().l("Could not synthesize final report file for " + file, e8);
        }
    }

    private int E(String str, int i8) {
        List p8 = this.f6856b.p(str, new FilenameFilter() { // from class: M0.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t8;
                t8 = e.t(file, str2);
                return t8;
            }
        });
        Collections.sort(p8, new Comparator() { // from class: M0.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x8;
                x8 = e.x((File) obj, (File) obj2);
                return x8;
            }
        });
        return f(p8, i8);
    }

    private static String F(File file) {
        try {
            return A(file);
        } catch (IOException unused) {
            return null;
        }
    }

    private static void G(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f6850e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void H(File file, String str, long j8) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f6850e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j8));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet e(String str) {
        this.f6856b.b();
        SortedSet p8 = p();
        if (str != null) {
            p8.remove(str);
        }
        if (p8.size() <= 8) {
            return p8;
        }
        while (p8.size() > 8) {
            String str2 = (String) p8.last();
            E0.f.f().b("Removing session over cap: " + str2);
            this.f6856b.c(str2);
            p8.remove(str2);
        }
        return p8;
    }

    private static int f(List list, int i8) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i8) {
                return size;
            }
            f.s(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i8 = this.f6857c.b().f7694a.f7706b;
        List n8 = n();
        int size = n8.size();
        if (size <= i8) {
            return;
        }
        Iterator it = n8.subList(i8, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j8) {
        return j8 * 1000;
    }

    private void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String m(int i8, boolean z8) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i8));
        if (z8) {
            str = "_";
        } else {
            str = "";
        }
        return NotificationCompat.CATEGORY_EVENT + format + str;
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f6856b.k());
        arrayList.addAll(this.f6856b.h());
        Comparator comparator = f6853h;
        Collections.sort(arrayList, comparator);
        List m8 = this.f6856b.m();
        Collections.sort(m8, comparator);
        arrayList.addAll(m8);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f6851f);
    }

    private static boolean s(String str) {
        if (str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        if (str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f6856b.m());
        j(this.f6856b.k());
        j(this.f6856b.h());
    }

    public void k(String str, long j8) {
        for (String str2 : e(str)) {
            E0.f.f().i("Finalizing report for session " + str2);
            C(str2, j8);
            this.f6856b.c(str2);
        }
        g();
    }

    public void l(String str, B.d dVar, B.a aVar) {
        File o8 = this.f6856b.o(str, "report");
        E0.f.f().b("Writing native session report for " + str + " to file: " + o8);
        B(o8, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f6856b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f6856b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        if (this.f6856b.m().isEmpty() && this.f6856b.k().isEmpty() && this.f6856b.h().isEmpty()) {
            return false;
        }
        return true;
    }

    public List w() {
        List<File> n8 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n8) {
            try {
                arrayList.add(AbstractC1184s.a(f6852g.F(A(file)), file.getName(), file));
            } catch (IOException e8) {
                E0.f.f().l("Could not load report file " + file + "; deleting", e8);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(B.e.d dVar, String str, boolean z8) {
        int i8 = this.f6857c.b().f7694a.f7705a;
        try {
            G(this.f6856b.o(str, m(this.f6855a.getAndIncrement(), z8)), f6852g.i(dVar));
            String d8 = this.f6858d.d();
            if (d8 == null) {
                E0.f.f().k("Missing AQS session id for Crashlytics session " + str);
            } else {
                G(this.f6856b.o(str, "app-quality-session-id"), d8);
            }
        } catch (IOException e8) {
            E0.f.f().l("Could not persist event for session " + str, e8);
        }
        E(str, i8);
    }

    public void z(B b8) {
        B.e l8 = b8.l();
        if (l8 == null) {
            E0.f.f().b("Could not get session for report");
            return;
        }
        String i8 = l8.i();
        try {
            G(this.f6856b.o(i8, "report"), f6852g.G(b8));
            H(this.f6856b.o(i8, "start-time"), "", l8.l());
        } catch (IOException e8) {
            E0.f.f().c("Could not persist report for session " + i8, e8);
        }
    }
}
