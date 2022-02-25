# Android Netrunner

This is a Spring MVC project making extensive use of AWS resources.

<h2>Phase 1</h2>
<p>Application that runs locally with bootstrapped data stored via JPA in an H2 database. This minimally viable version will not have full CRUD capabilities in that users will not be able to edit back-end data.</p> 

<h2>Phase 2</h2>
<p>Connect application to an AWS hosted MySQL database. Database will be built from csv file stored in S3 instance. Lambda function will detect updates to the S3 contents and trigger update.</p>

<h2>Phase 3</h2>
<p>Set up CI/CD pipeline in AWS that will:</p>
<ul>
<li>Use of webhooks to trigger build when Github repo is updated</li>
<li>Deployment of application to Elastic Beanstalk</li>
<li>Cloudfront to handle DNS resolution of environment URL</li>
</ul>

<p>Phase 4</p>
<p>Coming soon</p>