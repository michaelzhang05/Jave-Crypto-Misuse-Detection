package O7;

import com.inmobi.cmp.data.model.ChoiceColor;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceColor f8499a;

    /* renamed from: b, reason: collision with root package name */
    public final P7.a f8500b;

    public b(ChoiceColor choiceColor, P7.a resolver) {
        AbstractC3255y.i(resolver, "resolver");
        this.f8499a = choiceColor;
        this.f8500b = resolver;
    }

    @Override // O7.a
    public Object a(S5.d dVar) {
        ChoiceColor colorResources = this.f8499a;
        if (colorResources == null) {
            return null;
        }
        this.f8500b.getClass();
        AbstractC3255y.i(colorResources, "colorResources");
        return new M7.c(colorResources.getDividerColor(), colorResources.getTabBackgroundColor(), colorResources.getSearchBarBackgroundColor(), colorResources.getSearchBarForegroundColor(), colorResources.getToggleActiveColor(), colorResources.getToggleInactiveColor(), colorResources.getGlobalBackgroundColor(), colorResources.getTitleTextColor(), colorResources.getBodyTextColor(), colorResources.getTabTextColor(), colorResources.getMenuTextColor(), colorResources.getLinkTextColor(), colorResources.getButtonTextColor(), colorResources.getButtonDisabledTextColor(), colorResources.getButtonBackgroundColor(), colorResources.getButtonDisabledBackgroundColor());
    }
}
