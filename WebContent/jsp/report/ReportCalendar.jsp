<%@ page contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Report</title>
	<s:include value="/jsp/report/include/report-ja-css.jsp"/>
</head>
<body>
	
	<nav aria-label="breadcrumb">
	  	<ol class="breadcrumb">
	    	<li class="breadcrumb-item"><a href="<s:url action="page-home"/>">Struts</a></li>
	    	<li class="breadcrumb-item"><a href="<s:url action="page-report"/>">Report</a></li>
	    	<li class="breadcrumb-item active" aria-current="page">Report</li>
	  	</ol>
	</nav>
	
	<h4>Report Calendar</h4>
	<div class="container">
		<div class="row">
			<div class="span12">
	    	    <table class="table-condensed table-bordered table-striped">
	                <thead>
	                    <tr>
	                      <th colspan="7" >
	                        <a class="btn"><i class="icon-chevron-left"></i></a>
	                        <a class="btn">พฤษภาคม 2560</a>
	                        <a class="btn"><i class="icon-chevron-right"></i></a>
	                      </th>
	                    </tr>
	                    <tr>
	                        <th>Su</th>
	                        <th>Mo</th>
	                        <th>Tu</th>
	                        <th>We</th>
	                        <th>Th</th>
	                        <th>Fr</th>
	                        <th>Sa</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    <tr>
	                        <td>1</td>
	                        <td>2</td>
	                        <td>3</td>
	                        <td>4</td>
	                        <td>5</td>
	                        <td>6</td>
	                        <td>7</td>
	                    </tr>
	                    <tr>
	                        <td>8</td>
	                        <td>9</td>
	                        <td>10</td>
	                        <td>11</td>
	                        <td>12</td>
	                        <td>13</td>
	                        <td>14</td>
	                    </tr>
	                    <tr>
	                        <td>15</td>
	                        <td>16</td>
	                        <td>17</td>
	                        <td>18</td>
	                        <td>19</td>
	                        <td>20</td>
	                        <td>21</td>
	                    </tr>
	                    <tr>
	                        <td>22</td>
	                        <td>23</td>
	                        <td>24</td>
	                        <td>25</td>
	                        <td>26</td>
	                        <td>27</td>
	                        <td>28</td>
	                    </tr>
	                    <tr>
	                        <td>29</td>
	                        <td>30</td>
	                        <td>31</td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                        <td></td>
	                    </tr>
	                </tbody>
	            </table>    
			</div>
		</div>
		<!-- จบตาราง -->
		
		<br/>
		<s:form action="exportCalendar" namespace="/jsp/report" method="post">
			<button type="submit" class="btn btn-primary">Export</button>
		</s:form>
		
	</div>

</body>
</html>