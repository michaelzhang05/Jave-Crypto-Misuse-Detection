package O0;

import G0.h;
import J0.AbstractC1286v;
import J0.C1279n;
import K0.l;
import L0.F;
import M0.j;
import Q0.i;
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
    private static final Charset f7816e = Charset.forName(C.UTF8_NAME);

    /* renamed from: f, reason: collision with root package name */
    private static final int f7817f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f7818g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f7819h = new Comparator() { // from class: O0.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u8;
            u8 = e.u((File) obj, (File) obj2);
            return u8;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f7820i = new FilenameFilter() { // from class: O0.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v8;
            v8 = e.v(file, str);
            return v8;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f7821a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f7822b;

    /* renamed from: c, reason: collision with root package name */
    private final i f7823c;

    /* renamed from: d, reason: collision with root package name */
    private final C1279n f7824d;

    public e(g gVar, i iVar, C1279n c1279n) {
        this.f7822b = gVar;
        this.f7823c = iVar;
        this.f7824d = c1279n;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f7816e);
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

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String d8 = this.f7824d.d(str);
        try {
            j jVar = f7818g;
            F(this.f7822b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(d8)));
        } catch (IOException e8) {
            h.f().l("Could not synthesize final native report file for " + file, e8);
        }
    }

    private void C(String str, long j8) {
        boolean z8;
        List<File> r8 = this.f7822b.r(str, f7820i);
        if (r8.isEmpty()) {
            h.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r8);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z8 = false;
            for (File file : r8) {
                try {
                    arrayList.add(f7818g.j(A(file)));
                } catch (IOException e8) {
                    h.f().l("Could not add event to report for " + file, e8);
                }
                if (z8 || s(file.getName())) {
                    z8 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            h.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f7822b.q(str, "report"), arrayList, j8, z8, l.i(str, this.f7822b), this.f7824d.d(str));
    }

    private void D(File file, List list, long j8, boolean z8, String str, String str2) {
        File n8;
        try {
            j jVar = f7818g;
            F r8 = jVar.L(A(file)).v(j8, z8, str).p(str2).r(list);
            F.e n9 = r8.n();
            if (n9 == null) {
                return;
            }
            h.f().b("appQualitySessionId: " + str2);
            if (z8) {
                n8 = this.f7822b.l(n9.i());
            } else {
                n8 = this.f7822b.n(n9.i());
            }
            F(n8, jVar.M(r8));
        } catch (IOException e8) {
            h.f().l("Could not synthesize final report file for " + file, e8);
        }
    }

    private int E(String str, int i8) {
        List r8 = this.f7822b.r(str, new FilenameFilter() { // from class: O0.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t8;
                t8 = e.t(file, str2);
                return t8;
            }
        });
        Collections.sort(r8, new Comparator() { // from class: O0.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x8;
                x8 = e.x((File) obj, (File) obj2);
                return x8;
            }
        });
        return f(r8, i8);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7816e);
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

    private static void G(File file, String str, long j8) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7816e);
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
        this.f7822b.d();
        SortedSet p8 = p();
        if (str != null) {
            p8.remove(str);
        }
        if (p8.size() <= 8) {
            return p8;
        }
        while (p8.size() > 8) {
            String str2 = (String) p8.last();
            h.f().b("Removing session over cap: " + str2);
            this.f7822b.e(str2);
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
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i8 = this.f7823c.b().f9093a.f9105b;
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
        arrayList.addAll(this.f7822b.m());
        arrayList.addAll(this.f7822b.j());
        Comparator comparator = f7819h;
        Collections.sort(arrayList, comparator);
        List o8 = this.f7822b.o();
        Collections.sort(o8, comparator);
        arrayList.addAll(o8);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f7817f);
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
        j(this.f7822b.o());
        j(this.f7822b.m());
        j(this.f7822b.j());
    }

    public void k(String str, long j8) {
        for (String str2 : e(str)) {
            h.f().i("Finalizing report for session " + str2);
            C(str2, j8);
            this.f7822b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File q8 = this.f7822b.q(str, "report");
        h.f().b("Writing native session report for " + str + " to file: " + q8);
        B(q8, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f7822b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f7822b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        if (this.f7822b.o().isEmpty() && this.f7822b.m().isEmpty() && this.f7822b.j().isEmpty()) {
            return false;
        }
        return true;
    }

    public List w() {
        List<File> n8 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n8) {
            try {
                arrayList.add(AbstractC1286v.a(f7818g.L(A(file)), file.getName(), file));
            } catch (IOException e8) {
                h.f().l("Could not load report file " + file + "; deleting", e8);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z8) {
        int i8 = this.f7823c.b().f9093a.f9104a;
        try {
            F(this.f7822b.q(str, m(this.f7821a.getAndIncrement(), z8)), f7818g.k(dVar));
        } catch (IOException e8) {
            h.f().l("Could not persist event for session " + str, e8);
        }
        E(str, i8);
    }

    public void z(F f8) {
        F.e n8 = f8.n();
        if (n8 == null) {
            h.f().b("Could not get session for report");
            return;
        }
        String i8 = n8.i();
        try {
            F(this.f7822b.q(i8, "report"), f7818g.M(f8));
            G(this.f7822b.q(i8, "start-time"), "", n8.l());
        } catch (IOException e8) {
            h.f().c("Could not persist report for session " + i8, e8);
        }
    }
}
