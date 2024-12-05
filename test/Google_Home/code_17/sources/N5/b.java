package N5;

import P5.AbstractC1378t;
import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.xml.sax.XMLReader;

/* loaded from: classes5.dex */
public final class b implements Html.TagHandler {

    /* renamed from: a, reason: collision with root package name */
    public final List f7756a = new ArrayList();

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z8, String str, Editable text, XMLReader xMLReader) {
        c cVar;
        AbstractC3255y.i(text, "output");
        int i8 = 0;
        if (AbstractC3255y.d("customUl", str) && z8) {
            this.f7756a.add(0, new e());
            return;
        }
        if (AbstractC3255y.d("customOl", str) && z8) {
            this.f7756a.add(0, new d());
            return;
        }
        if ((AbstractC3255y.d("customUl", str) || AbstractC3255y.d("customOl", str)) && !z8) {
            AbstractC1378t.N(this.f7756a);
            return;
        }
        if (AbstractC3255y.d("customLi", str) && z8) {
            ((c) AbstractC1378t.m0(this.f7756a)).c(text);
            return;
        }
        if (AbstractC3255y.d("customLi", str) && !z8) {
            c cVar2 = (c) AbstractC1378t.m0(this.f7756a);
            int size = this.f7756a.size();
            cVar2.getClass();
            AbstractC3255y.i(text, "text");
            cVar2.a(text);
            c[] listTags = (c[]) text.getSpans(0, text.length(), c.class);
            AbstractC3255y.h(listTags, "listTags");
            if (listTags.length == 0) {
                cVar = null;
            } else {
                cVar = listTags[listTags.length - 1];
            }
            int spanStart = text.getSpanStart(cVar);
            text.removeSpan(cVar);
            if (spanStart != text.length()) {
                Object[] b8 = cVar2.b(text, size);
                int length = b8.length;
                while (i8 < length) {
                    Object obj = b8[i8];
                    i8++;
                    text.setSpan(obj, spanStart, text.length(), 33);
                }
            }
        }
    }
}
