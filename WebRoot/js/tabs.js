   function showTab(tabHeadId,tabContentId,current_index){

            var tabDiv = document.getElementById("tabDiv");

            //��tab�������е����ݲ���Ϊ���ɼ�

            //����tab���µ������ӽڵ�

            var taContents = tabDiv.childNodes;

            for(i=0; i<taContents.length; i++)

            {

                //���������ݲ㶼��Ϊ���ɼ�

                if(taContents[i].id!=null && taContents[i].id != 'tabsHolder')

                {

                    taContents[i].style.display = 'none';

                }

            }
           //��Ҫ��ʾ�Ĳ���Ϊ�ɼ�

            document.getElementById(tabContentId).style.display = 'block';
            //����tabͷ�����еĳ�����

            var tabHeads = document.getElementById('tabsHolder').getElementsByTagName('img');
            var arr=["newSeek","newGet","leifeng"];//ǳɫ��
            var arr_2=["newSeek2","newGet2","leifeng2"];//��ɫ��

            for(i=0; i<tabHeads.length; i++)//����img����
            {

                //�������ӵ���ʽ��Ϊδѡ��tabͷ��ʽ

                tabHeads[i].src="images/"+arr[i]+".gif";//���еĻ�����ɫ

            }

            //����ǰ�����ӵ���ʽ��Ϊ��ѡtabͷ��ʽ
            var cur=document.getElementById(tabHeadId).getElementsByTagName('img');//�Ǹ�����
            //alert(cur);
            cur[0].src="images/"+arr_2[current_index]+".gif";//��ǰ�Ļ���ǳɫ

            document.getElementById(tabHeadId).blur();

        }
		
		