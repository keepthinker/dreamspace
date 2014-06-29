-- shiro sql begin
insert into user(name,password,profile) values('root','123456','he he');
insert into user(name,password,profile) values('keepthinker','123456','keep thinking!');
insert into user(name,password,profile) values('zhangquanling','123456','a funny guy');
insert into user(name,password,profile) values('liyang','123456','look to the future with confidence');
insert into user(name,password,profile) values('xiyueyiwan','123456','good good study,day day up');
insert into user(name,password,profile) values('wangboxing','123456','a talented dotaer');
insert into user(name,password,profile) values('renmengjie','123456','just do it');

insert into role(role_name) values('root');
insert into role(role_name) values('user');

insert into permission(permission_name) values('root');
insert into permission(permission_name) values('normal');

insert into user_role_relation(user_id,role_id) values(1,1);
insert into user_role_relation(user_id,role_id) values(2,2);
insert into user_role_relation(user_id,role_id) values(3,2);
insert into user_role_relation(user_id,role_id) values(4,2);
insert into user_role_relation(user_id,role_id) values(5,2);
insert into user_role_relation(user_id,role_id) values(6,2);

insert into role_permission_relation(role_id,permission_id) values(1,1);
insert into role_permission_relation(role_id,permission_id) values(2,2);

-- shiro sql end

-- others--begin

insert into blog(user_id,title,content,created_time,modified_time) values(2,'腾讯宣布战略投资58同城公司：本地生活服务战火再燃！','腾讯宣布战略投资58同城公司：本地生活服务战火再燃！ 

楼主  i黑马TMT 
昨天  22:10 


北京时间6月27日晚间消息，腾讯公司在港交所信息披露网站上宣布，已斥资7.36亿美元收购58同城公司(WUBA)19.9%的股份。以下为腾讯披露文件的主体部分： 

董事会欣然宣布，于2014年6月27日，买方(本公司的全资附属公司)与58.com订立投资协议。58.com为一家于纽约证券交易所[微博]上市的公司，并会向 美国证交会提交关于订立投资协议的申报。 

58.com为一家根据开曼群岛法律注册成立的公司，经营中国最大分类广告平台。 

根据投资协议，买方将向58.com认购及购买若干普通股，而58.com将向若干现有股东购回若干B类普通股，使买方于交易完成后将拥有58.com发行在外总股本合共19.9%权益及58.com投票权益的15.2%(按全面摊薄基准计算)，代价约为7.36亿美元。 

由于交易的适用百分比率(定义见上市规则第14.07条)并无超过5%，故交易并不构成上市规则第十四章项下的须予公布的交易。据董事在作出一切合理查询后所知、所悉及所信，58.com及其附属公司(以及其最终实益拥有人)并非本公司的关连人士，而交易并不构成上市规则第十四A章项下的关连交易。 

根据上市规则第13.09(2)条或证券及期货条例(香港法例第571章)第XIVA部项下的内幕消息条文，交易并不构成内幕消息。 

i黑马评论：我们认为三点理由足以让腾讯入股58同城。 

1、遏制阿里巴巴。58同城是服务版淘宝。正如黑马导师姚劲波所说的那样，他最推崇的创始人是马云。58同城是一个服务版的淘宝。它将本地游商成功运作到了网络上。入股58同城，有利于在本地生活服务领域进一步压缩阿里巴巴对这一块市场的侵入。你有美团，我有大众点评，你有天猫，我有京东，而58同城的业务对大众点评和京东是有力的补充，是必须争取的对象，否则就只能去买行业第二了。在近来动作越来越大的阿里巴巴面前，买第二不仅仅是声势上败退，更是一种战略性的失败！ 

2、借力58同城，进一步推动微信商业化。近来，随着微信购物成为一种流行，微信是否能够完成除点餐外，还能做别的业务成为大家畅想的焦点。58同城是中国最大的本地生活服务网站，将极大地丰富微信的应用场景。 

与此同时，58同城主要的业务还是流量倒卖，就是把从百度上搞来的长尾关键词，卖给平台上的商家，从中赚取差价。而微信上拥有海量的流量，正愁如何进一步变现，如果入股58，将流量注入58同城，将极大地提升58的业务量，换言之，58和腾讯结合是大势所趋，因为双方共同受益。 

3、终极目的，力压支付。随着微信和手Q的普及，如何通过微信这个壳子，做大财付通，也是腾讯一直思考的重点。显然本地生活服务市场对于做大财付通有着重大意义。京东，腾讯再怎么入股，京东首先会保障自己的支付工具，而58没有自己的支付工具。58目前主要的支付工具是阿里巴巴的支付宝，腾讯如果能通过入股，把58上的海量用户的支付习惯变成财付通，这将是财付通赶超支付宝的最重要的机会。所以，姚团是各方都要争取的诸侯！'
,now(),now());



insert into blog(user_id,title,content,created_time,modified_time) values(2,']爸爸的责任——齐宏伟','我们家从不看电视，客厅里也绝不摆放电视机，若要了解新闻时事，就上网看帖或翻翻报刊杂志。晚饭后这段家庭时光太重要了，白给了冷冰冰的电视屏幕，实在不值得。尤其对孩子来说，这段亲情时光更是黄金时光。
受美国医学博士艾盖瑞和贝南罗特的专著《从零岁开始》的影响，我们夫妇都认为，对孩子特别重要的一点是，要让她从小就知道她是家庭的一员，而不是家庭的中心。因此，在晚饭后的家庭时光中，我们就刻意训练她坐在自己的座位上，没轮到她说话的时候，她要保持安静，不能通过吵闹或哭泣博得大人们的关注。若她吵闹或哭泣的话，就送她到别的房间，谁也不理她。
有时，我们夫妇还会特意留出一段“沙发时光”，这个时候，我们会对女儿说：“唱唱，现在是爸爸和妈妈说话的时间，不是陪你的时间，你一个人去安静地玩一会儿，不要来打扰爸爸妈妈，好吗？”唱唱不到两岁时已经懂得遵守家庭秩序，在“沙发时光”中也能跟大人友好相处。爱，最重要的是付出时间。不是单方面付出，而要夫妻双方一同付出。
前美国国际神学研究院院长唐崇怀博士给我讲过一个美国版故事，我印象很深：有个孩子问爸爸一小时能赚多少钱，爸爸说能赚30美元。结果，孩子回到自己的小房间，把储蓄罐摔破了，捧着一把硬币出来说：“爸爸，我只有15美元，能不能买你半个小时？”
中国的情形又如何呢？恐怕更糟糕。多少爸爸在孩子成长过程中缺席，却想用金钱来弥补，实在是荒唐又荒谬。《三字经》里说：“子不教，父之过。”此乃至理名言。
当然，爸爸们工作压力大，在外面为全家打拼不容易，但有一点许多爸爸肯定能做得到，那就是晚饭后关掉电视机，把看电视的时间变成陪孩子说说话的时间，若能再在一起读点好书，那就更好了。对孩子的教育不能全推给社会和学校。从教育原理上看也就是如此：家庭大概承担70%的任务，学校承担 30%的任务。
爸爸不能承担教育责任的恶果在《百年孤独》中有很好的描述。布恩地亚上校的爸爸痴迷于自己的所谓发明，在孩子长到十多岁的时候，才突然意识到他们的存在，这时才来管他们，爱他们，但已经晚了，孩子们已经永远丧失了爱的能力。
布恩地亚上校的妈妈乌苏拉终于看透了他，“她明白了奥雷良诺•布恩地亚上校失去对家庭的爱，并不像她原先以为的那样，是因为战争的残酷，而是因为他从来没有爱过谁。她最后得出结论，这个她险些为他丢了性命的儿子只是个没有爱的能力的人。”而这一点，恰恰是因为她丈夫和她没有施教和给予爱而导致的。
爱是恒久忍耐的付出和舍己，直到孩子也从你这里学会了付出和舍己，否则，他们又从哪里去学呢？
我见过很多喜欢利用晚上时间喝酒和看电视的爸爸们，全然不顾及他们的孩子正在模仿他们的饕餮和自私。他们把大量时间用在应酬上，没有时间在家里陪孩子。好不容易回家了，又忙着看自己喜欢或者不喜欢的电视节目。
天下所有的角色中，爸爸似乎是最容易当的，连生孩子的痛苦都免了，孩子一落地，就白拣了老爸来当。但当爸爸其实又是最难的，因为你要在一次次舍己中把你没受到的生孩子的痛苦给补上。
但是，总有一天，你会发现，这一切都值得，就像我那不到两岁的女儿看到我下楼，没人教她，却本能地冲口而出：“爸爸，小心点儿，不要跌倒了！”那一刻，爸爸的心融化了。
我这才发现，所有的苦都不是苦，而是欢乐。'
,now(),now());

-- others--end



drop table user_role_relation;
drop table role_permission_relation;
drop table friendship;
drop table comment;
drop table blog;
drop table user;
drop table role;
drop table permission;

alter table user change name user_name varchar(35);

