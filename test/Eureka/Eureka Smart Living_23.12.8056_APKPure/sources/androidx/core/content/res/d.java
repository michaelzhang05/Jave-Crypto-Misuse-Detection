package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f2039a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f2040b;

    /* renamed from: c, reason: collision with root package name */
    private int f2041c;

    private d(Shader shader, ColorStateList colorStateList, int i6) {
        this.f2039a = shader;
        this.f2040b = colorStateList;
        this.f2041c = i6;
    }

    private static d a(Resources resources, int i6, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i6);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(int i6) {
        return new d(null, null, i6);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i6, Resources.Theme theme) {
        try {
            return a(resources, i6, theme);
        } catch (Exception e6) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
            return null;
        }
    }

    public int e() {
        return this.f2041c;
    }

    public Shader f() {
        return this.f2039a;
    }

    public boolean h() {
        return this.f2039a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f2039a == null && (colorStateList = this.f2040b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f2040b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2041c) {
                this.f2041c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i6) {
        this.f2041c = i6;
    }

    public boolean l() {
        return h() || this.f2041c != 0;
    }
}
