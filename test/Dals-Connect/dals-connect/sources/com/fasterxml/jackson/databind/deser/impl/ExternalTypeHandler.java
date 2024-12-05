package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ExternalTypeHandler {
    private final HashMap<String, Integer> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final ArrayList<ExtTypedProperty> _properties = new ArrayList<>();
        private final HashMap<String, Integer> _nameToPropertyIndex = new HashMap<>();

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            this._nameToPropertyIndex.put(settableBeanProperty.getName(), valueOf);
            this._nameToPropertyIndex.put(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i2 = 0; i2 < size; i2++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i2);
                SettableBeanProperty find = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (find != null) {
                    extTypedProperty.linkTypeProperty(find);
                }
                extTypedPropertyArr[i2] = extTypedProperty;
            }
            return new ExternalTypeHandler(extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.getDefaultImpl() != null;
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    protected ExternalTypeHandler(ExtTypedProperty[] extTypedPropertyArr, HashMap<String, Integer> hashMap, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = hashMap;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    protected final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i2, String str) throws IOException {
        JsonParser asParser = this._tokens[i2].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        return this._properties[i2].getProperty().deserialize(asParser2, deserializationContext);
    }

    protected final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i2, String str) throws IOException {
        JsonParser asParser = this._tokens[i2].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i2].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i2].getProperty().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this._properties.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = this._typeIds[i2];
            if (str == null) {
                TokenBuffer tokenBuffer = this._tokens[i2];
                if (tokenBuffer != null) {
                    JsonToken firstToken = tokenBuffer.firstToken();
                    if (firstToken != null && firstToken.isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        SettableBeanProperty property = this._properties[i2].getProperty();
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, property.getType());
                        if (deserializeIfNatural != null) {
                            property.set(obj, deserializeIfNatural);
                        } else if (this._properties[i2].hasDefaultType()) {
                            str = this._properties[i2].getDefaultTypeId();
                        } else {
                            deserializationContext.reportMappingException("Missing external type id property '%s'", this._properties[i2].getTypePropertyName());
                        }
                    }
                }
            } else if (this._tokens[i2] == null) {
                SettableBeanProperty property2 = this._properties[i2].getProperty();
                if (property2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportMappingException("Missing property '%s' for external type id '%s'", property2.getName(), this._properties[i2].getTypePropertyName());
                }
                return obj;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i2, str);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r9._tokens[r0] != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r9._typeIds[r0] != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) throws java.io.IOException {
        /*
            r9 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r9._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r0 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r2 = r9._properties
            r2 = r2[r0]
            boolean r12 = r2.hasTypePropertyName(r12)
            r8 = 1
            if (r12 == 0) goto L30
            java.lang.String[] r12 = r9._typeIds
            java.lang.String r2 = r10.getText()
            r12[r0] = r2
            r10.skipChildren()
            if (r13 == 0) goto L45
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r9._tokens
            r12 = r12[r0]
            if (r12 == 0) goto L45
        L2e:
            r1 = 1
            goto L45
        L30:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r12.<init>(r10, r11)
            r12.copyCurrentStructure(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r9._tokens
            r2[r0] = r12
            if (r13 == 0) goto L45
            java.lang.String[] r12 = r9._typeIds
            r12 = r12[r0]
            if (r12 == 0) goto L45
            goto L2e
        L45:
            if (r1 == 0) goto L5a
            java.lang.String[] r12 = r9._typeIds
            r7 = r12[r0]
            r1 = 0
            r12[r0] = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            r6 = r0
            r2._deserializeAndSet(r3, r4, r5, r6, r7)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9._tokens
            r10[r0] = r1
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Integer num = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (!this._properties[intValue].hasTypePropertyName(str)) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj != null && this._tokens[intValue] != null) {
            z = true;
        }
        if (z) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, intValue, text);
            this._tokens[intValue] = null;
        } else {
            this._typeIds[intValue] = text;
        }
        return true;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    protected ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) throws IOException {
        int length = this._properties.length;
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = this._typeIds[i2];
            ExtTypedProperty extTypedProperty = this._properties[i2];
            if (str == null) {
                if (this._tokens[i2] != null) {
                    if (extTypedProperty.hasDefaultType()) {
                        str = extTypedProperty.getDefaultTypeId();
                    } else {
                        deserializationContext.reportMappingException("Missing external type id property '%s'", extTypedProperty.getTypePropertyName());
                    }
                }
            } else if (this._tokens[i2] == null) {
                deserializationContext.reportMappingException("Missing property '%s' for external type id '%s'", extTypedProperty.getProperty().getName(), this._properties[i2].getTypePropertyName());
            }
            objArr[i2] = _deserialize(jsonParser, deserializationContext, i2, str);
            SettableBeanProperty property = extTypedProperty.getProperty();
            if (property.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(property, objArr[i2]);
                SettableBeanProperty typeProperty = extTypedProperty.getTypeProperty();
                if (typeProperty != null && typeProperty.getCreatorIndex() >= 0) {
                    propertyValueBuffer.assignParameter(typeProperty, str);
                }
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i3 = 0; i3 < length; i3++) {
            SettableBeanProperty property2 = this._properties[i3].getProperty();
            if (property2.getCreatorIndex() < 0) {
                property2.set(build, objArr[i3]);
            }
        }
        return build;
    }
}
