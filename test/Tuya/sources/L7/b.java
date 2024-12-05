package L7;

import com.inmobi.cmp.data.model.ChoiceColor;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceColor f6708a;

    /* renamed from: b, reason: collision with root package name */
    public final M7.a f6709b;

    public b(ChoiceColor choiceColor, M7.a resolver) {
        AbstractC3159y.i(resolver, "resolver");
        this.f6708a = choiceColor;
        this.f6709b = resolver;
    }

    @Override // L7.a
    public Object a(P5.d dVar) {
        ChoiceColor colorResources = this.f6708a;
        if (colorResources == null) {
            return null;
        }
        this.f6709b.getClass();
        AbstractC3159y.i(colorResources, "colorResources");
        return new J7.c(colorResources.getDividerColor(), colorResources.getTabBackgroundColor(), colorResources.getSearchBarBackgroundColor(), colorResources.getSearchBarForegroundColor(), colorResources.getToggleActiveColor(), colorResources.getToggleInactiveColor(), colorResources.getGlobalBackgroundColor(), colorResources.getTitleTextColor(), colorResources.getBodyTextColor(), colorResources.getTabTextColor(), colorResources.getMenuTextColor(), colorResources.getLinkTextColor(), colorResources.getButtonTextColor(), colorResources.getButtonDisabledTextColor(), colorResources.getButtonBackgroundColor(), colorResources.getButtonDisabledBackgroundColor());
    }
}
