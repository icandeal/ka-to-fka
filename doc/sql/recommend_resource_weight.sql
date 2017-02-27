create table recommend_resource_weight  (
   ref                  number(19)                      not null,
   resource_id          number(19)                      not null,
   class_id             number(9)                       not null,
   weight               NUMBER(9,8)                     not null,
   c_time               date                           default sysdate not null,
   m_time               date,
   c_user_id            number(19),
   m_user_id            number(19),
   constraint PK_RECOMMEND_RESOURCE_WEIGHT primary key (ref),
   constraint uk_resid unique (resource_id)
);

comment on table recommend_resource_weight is
'推荐系统中 资源被推荐的权重';

comment on column recommend_resource_weight.ref is
'主键';

comment on column recommend_resource_weight.resource_id is
'资源id';

comment on column recommend_resource_weight.class_id is
'资源类型';

comment on column recommend_resource_weight.weight is
'资源权重';

comment on column recommend_resource_weight.c_time is
'创建时间';

comment on column recommend_resource_weight.m_time is
'修改时间';

comment on column recommend_resource_weight.c_user_id is
'创建人';

comment on column recommend_resource_weight.m_user_id is
'修改人';
