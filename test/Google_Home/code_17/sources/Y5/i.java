package Y5;

import O5.I;
import i6.AbstractC3001j;
import i6.InterfaceC2998g;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public abstract class i {

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13575a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f13575a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f8278a;
        }

        public final void invoke(String it) {
            AbstractC3255y.i(it, "it");
            this.f13575a.add(it);
        }
    }

    public static final long a(Reader reader, Writer out, int i8) {
        AbstractC3255y.i(reader, "<this>");
        AbstractC3255y.i(out, "out");
        char[] cArr = new char[i8];
        int read = reader.read(cArr);
        long j8 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j8 += read;
            read = reader.read(cArr);
        }
        return j8;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(reader, writer, i8);
    }

    public static final void c(Reader reader, Function1 action) {
        BufferedReader bufferedReader;
        AbstractC3255y.i(reader, "<this>");
        AbstractC3255y.i(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            I i8 = I.f8278a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final InterfaceC2998g d(BufferedReader bufferedReader) {
        AbstractC3255y.i(bufferedReader, "<this>");
        return AbstractC3001j.d(new h(bufferedReader));
    }

    public static final List e(Reader reader) {
        AbstractC3255y.i(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        c(reader, new a(arrayList));
        return arrayList;
    }

    public static final String f(Reader reader) {
        AbstractC3255y.i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        AbstractC3255y.h(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
