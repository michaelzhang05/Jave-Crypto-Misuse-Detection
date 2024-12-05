package K5;

import android.text.Spanned;
import androidx.core.text.HtmlCompat;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a {
    public static final Spanned a(String source) {
        AbstractC3159y.i(source, "source");
        Spanned fromHtml = HtmlCompat.fromHtml(n.y(n.y(n.y(n.y(n.y(n.y(source, "<ul>", "<customUl>", true), "</ul>", "</customUl>", true), "<ol>", "<customOl>", true), "<ol>", "</customOl>", true), "<li>", "<customLi>", true), "</li>", "</customLi>", true), 0, null, new b());
        AbstractC3159y.h(fromHtml, "fromHtml(customTagsSourc…, null, HtmlTagHandler())");
        return fromHtml;
    }
}
