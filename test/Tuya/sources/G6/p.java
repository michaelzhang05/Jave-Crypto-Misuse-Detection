package g6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class p extends o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31337a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            AbstractC3159y.i(line, "line");
            return line;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f31338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f31338a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            AbstractC3159y.i(line, "line");
            return this.f31338a + line;
        }
    }

    private static final Function1 b(String str) {
        if (str.length() == 0) {
            return a.f31337a;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (!AbstractC2725a.c(str.charAt(i8))) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 == -1) {
            return str.length();
        }
        return i8;
    }

    public static final String d(String str, String newIndent) {
        int i8;
        String str2;
        AbstractC3159y.i(str, "<this>");
        AbstractC3159y.i(newIndent, "newIndent");
        List a02 = x.a0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a02) {
            if (!n.u((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) AbstractC1246t.C0(arrayList2);
        int i9 = 0;
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        int length = str.length() + (newIndent.length() * a02.size());
        Function1 b8 = b(newIndent);
        int o8 = AbstractC1246t.o(a02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : a02) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1246t.w();
            }
            String str3 = (String) obj2;
            if ((i9 == 0 || i9 == o8) && n.u(str3)) {
                str3 = null;
            } else {
                String P02 = n.P0(str3, i8);
                if (P02 != null && (str2 = (String) b8.invoke(P02)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i9 = i10;
        }
        String sb = ((StringBuilder) AbstractC1246t.u0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        AbstractC3159y.h(sb, "toString(...)");
        return sb;
    }

    public static String e(String str) {
        AbstractC3159y.i(str, "<this>");
        return d(str, "");
    }
}
