package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", HttpUrl.FRAGMENT_ENCODE_SET, "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", HttpUrl.FRAGMENT_ENCODE_SET, "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes2.dex */
public class n extends m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "line", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<String, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f21590f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            l.f(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "line", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<String, String> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f21591f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f21591f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            l.f(str, "line");
            return this.f21591f + str;
        }
    }

    private static final Function1<String, String> b(String str) {
        return str.length() == 0 ? a.f21590f : new b(str);
    }

    public static final String c(String str, String str2, String str3) {
        int i2;
        String invoke;
        l.f(str, "<this>");
        l.f(str2, "newIndent");
        l.f(str3, "marginPrefix");
        if (!l.p(str3)) {
            List<String> a0 = v.a0(str);
            int length = str.length() + (str2.length() * a0.size());
            Function1<String, String> b2 = b(str2);
            int k2 = r.k(a0);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj : a0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    r.s();
                }
                String str4 = (String) obj;
                String str5 = null;
                if ((i3 == 0 || i3 == k2) && l.p(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            i2 = -1;
                            break;
                        }
                        if (!kotlin.text.a.c(str4.charAt(i5))) {
                            i2 = i5;
                            break;
                        }
                        i5++;
                    }
                    if (i2 != -1) {
                        int i6 = i2;
                        if (l.z(str4, str3, i2, false, 4, null)) {
                            int length3 = i6 + str3.length();
                            l.d(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(length3);
                            l.e(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (str5 != null && (invoke = b2.invoke(str5)) != null) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i3 = i4;
            }
            String sb = ((StringBuilder) r.Z(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            l.e(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static final String d(String str, String str2) {
        l.f(str, "<this>");
        l.f(str2, "marginPrefix");
        return c(str, HttpUrl.FRAGMENT_ENCODE_SET, str2);
    }

    public static /* synthetic */ String e(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return d(str, str2);
    }
}
