package V5;

import L5.I;
import f6.AbstractC2683j;
import f6.InterfaceC2680g;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class i {

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f11937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f11937a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return I.f6487a;
        }

        public final void invoke(String it) {
            AbstractC3159y.i(it, "it");
            this.f11937a.add(it);
        }
    }

    public static final long a(Reader reader, Writer out, int i8) {
        AbstractC3159y.i(reader, "<this>");
        AbstractC3159y.i(out, "out");
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
        AbstractC3159y.i(reader, "<this>");
        AbstractC3159y.i(action, "action");
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
            I i8 = I.f6487a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final InterfaceC2680g d(BufferedReader bufferedReader) {
        AbstractC3159y.i(bufferedReader, "<this>");
        return AbstractC2683j.d(new h(bufferedReader));
    }

    public static final List e(Reader reader) {
        AbstractC3159y.i(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        c(reader, new a(arrayList));
        return arrayList;
    }

    public static final String f(Reader reader) {
        AbstractC3159y.i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        AbstractC3159y.h(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
